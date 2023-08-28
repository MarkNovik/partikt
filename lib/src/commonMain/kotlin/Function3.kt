package me.mark.partikt

fun <A, B, C, D> id(fn: (A, B, C) -> D): (A, B, C) -> D = fn

inline operator fun <A, B, C, D> ((A, B, C) -> D).not() = rev(this)
inline fun <A, B, C, D> rev(crossinline fn: (A, B, C) -> D): (C, B, A) -> D = { c, b, a -> fn(a, b, c)}

inline operator fun <A, B, C, D> ((A, B, C) -> D).plus(a: A): (B, C) -> D = par(a)
inline fun <A, B, C, D> ((A, B, C) -> D).par(a: A): (B, C) -> D = { b, c -> this(a, b, c) }
inline fun <A, B, C, D> ((A, B, C) -> D).par(a: A, b: B): (C) -> D = { c -> this(a, b, c) }

inline operator fun <A, B, C, D> ((A, B, C) -> D).minus(c: C): (A, B) -> D = rep(c)
inline fun <A, B, C, D> ((A, B, C) -> D).rep(c: C): (A, B) -> D = { a, b -> this(a, b, c) }
inline fun <A, B, C, D> ((A, B, C) -> D).rep(b: B, c: C): (A) -> D = { a -> this(a, b, c) }
