package me.mark.partikt

fun <A, B, C, D, E, F, G, H, I, J, K> id(fn: (A, B, C, D, E, F, G, H, I, J) -> K): (A, B, C, D, E, F, G, H, I, J) -> K = fn

inline operator fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).not() = rev(this)
inline fun <A, B, C, D, E, F, G, H, I, J, K> rev(crossinline fn: (A, B, C, D, E, F, G, H, I, J) -> K): (J, I, H, G, F, E, D, C, B, A) -> K = { j, i, h, g, f, e, d, c, b, a -> fn(a, b, c, d, e, f, g, h, i, j)}

inline operator fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).plus(a: A): (B, C, D, E, F, G, H, I, J) -> K = par(a)
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A): (B, C, D, E, F, G, H, I, J) -> K = { b, c, d, e, f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A, b: B): (C, D, E, F, G, H, I, J) -> K = { c, d, e, f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A, b: B, c: C): (D, E, F, G, H, I, J) -> K = { d, e, f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A, b: B, c: C, d: D): (E, F, G, H, I, J) -> K = { e, f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A, b: B, c: C, d: D, e: E): (F, G, H, I, J) -> K = { f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A, b: B, c: C, d: D, e: E, f: F): (G, H, I, J) -> K = { g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G): (H, I, J) -> K = { h, i, j -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H): (I, J) -> K = { i, j -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I): (J) -> K = { j -> this(a, b, c, d, e, f, g, h, i, j) }

inline operator fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).minus(j: J): (A, B, C, D, E, F, G, H, I) -> K = rep(j)
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(j: J): (A, B, C, D, E, F, G, H, I) -> K = { a, b, c, d, e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(i: I, j: J): (A, B, C, D, E, F, G, H) -> K = { a, b, c, d, e, f, g, h -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(h: H, i: I, j: J): (A, B, C, D, E, F, G) -> K = { a, b, c, d, e, f, g -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(g: G, h: H, i: I, j: J): (A, B, C, D, E, F) -> K = { a, b, c, d, e, f -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(f: F, g: G, h: H, i: I, j: J): (A, B, C, D, E) -> K = { a, b, c, d, e -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(e: E, f: F, g: G, h: H, i: I, j: J): (A, B, C, D) -> K = { a, b, c, d -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(d: D, e: E, f: F, g: G, h: H, i: I, j: J): (A, B, C) -> K = { a, b, c -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J): (A, B) -> K = { a, b -> this(a, b, c, d, e, f, g, h, i, j) }
inline fun <A, B, C, D, E, F, G, H, I, J, K> ((A, B, C, D, E, F, G, H, I, J) -> K).rep(b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J): (A) -> K = { a -> this(a, b, c, d, e, f, g, h, i, j) }
