package me.mark.partikt

fun <A, B, C, D, E, F, G> id(fn: (A, B, C, D, E, F) -> G): (A, B, C, D, E, F) -> G = fn

inline operator fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).not() = rev(this)
inline fun <A, B, C, D, E, F, G> rev(crossinline fn: (A, B, C, D, E, F) -> G): (F, E, D, C, B, A) -> G = { f, e, d, c, b, a -> fn(a, b, c, d, e, f)}

inline operator fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).plus(a: A): (B, C, D, E, F) -> G = par(a)
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).par(a: A): (B, C, D, E, F) -> G = { b, c, d, e, f -> this(a, b, c, d, e, f) }
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).par(a: A, b: B): (C, D, E, F) -> G = { c, d, e, f -> this(a, b, c, d, e, f) }
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).par(a: A, b: B, c: C): (D, E, F) -> G = { d, e, f -> this(a, b, c, d, e, f) }
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).par(a: A, b: B, c: C, d: D): (E, F) -> G = { e, f -> this(a, b, c, d, e, f) }
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).par(a: A, b: B, c: C, d: D, e: E): (F) -> G = { f -> this(a, b, c, d, e, f) }

inline operator fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).minus(f: F): (A, B, C, D, E) -> G = rep(f)
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).rep(f: F): (A, B, C, D, E) -> G = { a, b, c, d, e -> this(a, b, c, d, e, f) }
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).rep(e: E, f: F): (A, B, C, D) -> G = { a, b, c, d -> this(a, b, c, d, e, f) }
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).rep(d: D, e: E, f: F): (A, B, C) -> G = { a, b, c -> this(a, b, c, d, e, f) }
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).rep(c: C, d: D, e: E, f: F): (A, B) -> G = { a, b -> this(a, b, c, d, e, f) }
inline fun <A, B, C, D, E, F, G> ((A, B, C, D, E, F) -> G).rep(b: B, c: C, d: D, e: E, f: F): (A) -> G = { a -> this(a, b, c, d, e, f) }
