package me.mark.partikt

fun <A, B, C, D, E, F> id(fn: (A, B, C, D, E) -> F): (A, B, C, D, E) -> F = fn

inline operator fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).not() = rev(this)
inline fun <A, B, C, D, E, F> rev(crossinline fn: (A, B, C, D, E) -> F): (E, D, C, B, A) -> F = { e, d, c, b, a -> fn(a, b, c, d, e)}

inline operator fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).plus(a: A): (B, C, D, E) -> F = par(a)
inline fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).par(a: A): (B, C, D, E) -> F = { b, c, d, e -> this(a, b, c, d, e) }
inline fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).par(a: A, b: B): (C, D, E) -> F = { c, d, e -> this(a, b, c, d, e) }
inline fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).par(a: A, b: B, c: C): (D, E) -> F = { d, e -> this(a, b, c, d, e) }
inline fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).par(a: A, b: B, c: C, d: D): (E) -> F = { e -> this(a, b, c, d, e) }

inline operator fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).minus(e: E): (A, B, C, D) -> F = rep(e)
inline fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).rep(e: E): (A, B, C, D) -> F = { a, b, c, d -> this(a, b, c, d, e) }
inline fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).rep(d: D, e: E): (A, B, C) -> F = { a, b, c -> this(a, b, c, d, e) }
inline fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).rep(c: C, d: D, e: E): (A, B) -> F = { a, b -> this(a, b, c, d, e) }
inline fun <A, B, C, D, E, F> ((A, B, C, D, E) -> F).rep(b: B, c: C, d: D, e: E): (A) -> F = { a -> this(a, b, c, d, e) }
