package me.mark.partikt

fun <A, B, C, D, E, F, G, H, I, J> id(fn: (A, B, C, D, E, F, G, H, I) -> J): (A, B, C, D, E, F, G, H, I) -> J = fn

inline operator fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).not() = rev(this)
inline fun <A, B, C, D, E, F, G, H, I, J> rev(crossinline fn: (A, B, C, D, E, F, G, H, I) -> J): (I, H, G, F, E, D, C, B, A) -> J = { i, h, g, f, e, d, c, b, a -> fn(a, b, c, d, e, f, g, h, i)}

inline operator fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).plus(a: A): (B, C, D, E, F, G, H, I) -> J = par(a)
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).par(a: A): (B, C, D, E, F, G, H, I) -> J = { b, c, d, e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).par(a: A, b: B): (C, D, E, F, G, H, I) -> J = { c, d, e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).par(a: A, b: B, c: C): (D, E, F, G, H, I) -> J = { d, e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).par(a: A, b: B, c: C, d: D): (E, F, G, H, I) -> J = { e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).par(a: A, b: B, c: C, d: D, e: E): (F, G, H, I) -> J = { f, g, h, i -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).par(a: A, b: B, c: C, d: D, e: E, f: F): (G, H, I) -> J = { g, h, i -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G): (H, I) -> J = { h, i -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H): (I) -> J = { i -> this(a, b, c, d, e, f, g, h, i) }

inline operator fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).minus(i: I): (A, B, C, D, E, F, G, H) -> J = rep(i)
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).rep(i: I): (A, B, C, D, E, F, G, H) -> J = { a, b, c, d, e, f, g, h -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).rep(h: H, i: I): (A, B, C, D, E, F, G) -> J = { a, b, c, d, e, f, g -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).rep(g: G, h: H, i: I): (A, B, C, D, E, F) -> J = { a, b, c, d, e, f -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).rep(f: F, g: G, h: H, i: I): (A, B, C, D, E) -> J = { a, b, c, d, e -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).rep(e: E, f: F, g: G, h: H, i: I): (A, B, C, D) -> J = { a, b, c, d -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).rep(d: D, e: E, f: F, g: G, h: H, i: I): (A, B, C) -> J = { a, b, c -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).rep(c: C, d: D, e: E, f: F, g: G, h: H, i: I): (A, B) -> J = { a, b -> this(a, b, c, d, e, f, g, h, i) }
inline fun <A, B, C, D, E, F, G, H, I, J> ((A, B, C, D, E, F, G, H, I) -> J).rep(b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I): (A) -> J = { a -> this(a, b, c, d, e, f, g, h, i) }
