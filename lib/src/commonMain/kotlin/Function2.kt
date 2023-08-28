package me.mark.partikt

fun <A, B, C> id(fn: (A, B) -> C): (A, B) -> C = fn

inline operator fun <A, B, C> ((A, B) -> C).not() = rev(this)
inline fun <A, B, C> rev(crossinline fn: (A, B) -> C): (B, A) -> C = { b, a -> fn(a, b)}

inline operator fun <A, B, C> ((A, B) -> C).plus(a: A): (B) -> C = par(a)
inline fun <A, B, C> ((A, B) -> C).par(a: A): (B) -> C = { b -> this(a, b) }

inline operator fun <A, B, C> ((A, B) -> C).minus(b: B): (A) -> C = rep(b)
inline fun <A, B, C> ((A, B) -> C).rep(b: B): (A) -> C = { a -> this(a, b) }
