package me.mark.gen.partikt

import java.io.File

const val DIR = "lib\\src\\commonMain\\kotlin"

fun main() {
    val dir = File(DIR)
    for (n in 2..25) {
        dir.resolve("Function$n.kt").writeText(genF(n))
    }
}

val letters = ('A'..'Z').toList()

fun types(n: Int): Pair<List<Char>, Char> = Pair(
    letters.take(n),
    letters[n]
)

fun List<*>.angle() = joinToString(prefix = "<", separator = ", ", postfix = ">")
fun <T> List<T>.commas(transform: (T) -> String = { it.toString() }) =
    joinToString(separator = ", ", transform = transform)

fun genF(n: Int, genPackage: Boolean = true): String = buildString {
    require(n in 2..25) { "Expected 2 <= n <= 25" }
    if (genPackage) {
        appendLine("package me.mark.partikt")
        appendLine()
    }
    val (inTypes, outType) = types(n)
    val typeParams = (inTypes + outType).angle()
    val inTypeParams = inTypes.commas()
    val funType = "($inTypeParams) -> $outType"
    // id
    appendLine("fun $typeParams id(fn: $funType): $funType = fn")
    //id
    appendLine()
    //rev, not
    val revFunType = "(${inTypes.asReversed().commas()}) -> $outType"
    val inParams = inTypes.commas(Char::lowercase)
    val revInParams = inTypes.asReversed().commas(Char::lowercase)
    appendLine("inline operator fun $typeParams ($funType).not() = rev(this)")
    appendLine(
        "inline fun $typeParams rev(crossinline fn: $funType): $revFunType = { $revInParams -> fn($inParams)}"
    )
    // rev, not
    appendLine()
    // plus, par
    appendLine(
        "inline operator fun $typeParams ($funType).plus(a: A): (${inTypes.drop(1).commas()}) -> $outType = par(a)"
    )
    for (m in 1..<n) {
        val inArgs = inTypes.take(m).commas { "${it.lowercase()}: $it" }
        val restParams = inTypes.drop(m).commas()
        val restArgs = inTypes.drop(m).commas(Char::lowercase)
        appendLine("inline fun $typeParams ($funType).par($inArgs): ($restParams) -> $outType = { $restArgs -> this($inParams) }")
    }
    // plus, par
    appendLine()
    // minus, rep
    run {
        val ret = inTypes.dropLast(1).commas()
        val inArg = inTypes.last().lowercase() + ": " + inTypes.last()
        appendLine(
            "inline operator fun $typeParams ($funType).minus($inArg): ($ret) -> $outType = rep(${inTypes.last().lowercase()})"
        )
    }
    for (m in 1..<n) {
        val inArgs = inTypes.takeLast(m).commas { "${it.lowercase()}: $it" }
        val restRet = inTypes.dropLast(m).commas()
        val restArgs = inTypes.dropLast(m).commas(Char::lowercase)
        appendLine(
            "inline fun $typeParams ($funType).rep($inArgs): ($restRet) -> $outType = { $restArgs -> this($inParams) }"
        )
    }
    // minus, rep
}