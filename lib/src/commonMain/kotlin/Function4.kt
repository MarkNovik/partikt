package me.mark.partikt

fun <A, B, C, D, E> id(fn: (A, B, C, D) -> E): (A, B, C, D) -> E = fn

inline operator fun <A, B, C, D, E> ((A, B, C, D) -> E).not() = rev(this)
inline fun <A, B, C, D, E> rev(crossinline fn: (A, B, C, D) -> E): (D, C, B, A) -> E = { d, c, b, a -> fn(a, b, c, d)}

inline operator fun <A, B, C, D, E> ((A, B, C, D) -> E).plus(a: A): (B, C, D) -> E = par(a)
inline fun <A, B, C, D, E> ((A, B, C, D) -> E).par(a: A): (B, C, D) -> E = { b, c, d -> this(a, b, c, d) }
inline fun <A, B, C, D, E> ((A, B, C, D) -> E).par(a: A, b: B): (C, D) -> E = { c, d -> this(a, b, c, d) }
inline fun <A, B, C, D, E> ((A, B, C, D) -> E).par(a: A, b: B, c: C): (D) -> E = { d -> this(a, b, c, d) }

inline operator fun <A, B, C, D, E> ((A, B, C, D) -> E).minus(d: D): (A, B, C) -> E = rep(d)
inline fun <A, B, C, D, E> ((A, B, C, D) -> E).rep(d: D): (A, B, C) -> E = { a, b, c -> this(a, b, c, d) }
inline fun <A, B, C, D, E> ((A, B, C, D) -> E).rep(c: C, d: D): (A, B) -> E = { a, b -> this(a, b, c, d) }
inline fun <A, B, C, D, E> ((A, B, C, D) -> E).rep(b: B, c: C, d: D): (A) -> E = { a -> this(a, b, c, d) }
