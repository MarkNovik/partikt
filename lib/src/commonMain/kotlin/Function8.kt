package me.mark.partikt

fun <A, B, C, D, E, F, G, H, I> id(fn: (A, B, C, D, E, F, G, H) -> I): (A, B, C, D, E, F, G, H) -> I = fn

inline operator fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).not() = rev(this)
inline fun <A, B, C, D, E, F, G, H, I> rev(crossinline fn: (A, B, C, D, E, F, G, H) -> I): (H, G, F, E, D, C, B, A) -> I = { h, g, f, e, d, c, b, a -> fn(a, b, c, d, e, f, g, h)}

inline operator fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).plus(a: A): (B, C, D, E, F, G, H) -> I = par(a)
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).par(a: A): (B, C, D, E, F, G, H) -> I = { b, c, d, e, f, g, h -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).par(a: A, b: B): (C, D, E, F, G, H) -> I = { c, d, e, f, g, h -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).par(a: A, b: B, c: C): (D, E, F, G, H) -> I = { d, e, f, g, h -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).par(a: A, b: B, c: C, d: D): (E, F, G, H) -> I = { e, f, g, h -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).par(a: A, b: B, c: C, d: D, e: E): (F, G, H) -> I = { f, g, h -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).par(a: A, b: B, c: C, d: D, e: E, f: F): (G, H) -> I = { g, h -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G): (H) -> I = { h -> this(a, b, c, d, e, f, g, h) }

inline operator fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).minus(h: H): (A, B, C, D, E, F, G) -> I = rep(h)
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).rep(h: H): (A, B, C, D, E, F, G) -> I = { a, b, c, d, e, f, g -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).rep(g: G, h: H): (A, B, C, D, E, F) -> I = { a, b, c, d, e, f -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).rep(f: F, g: G, h: H): (A, B, C, D, E) -> I = { a, b, c, d, e -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).rep(e: E, f: F, g: G, h: H): (A, B, C, D) -> I = { a, b, c, d -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).rep(d: D, e: E, f: F, g: G, h: H): (A, B, C) -> I = { a, b, c -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).rep(c: C, d: D, e: E, f: F, g: G, h: H): (A, B) -> I = { a, b -> this(a, b, c, d, e, f, g, h) }
inline fun <A, B, C, D, E, F, G, H, I> ((A, B, C, D, E, F, G, H) -> I).rep(b: B, c: C, d: D, e: E, f: F, g: G, h: H): (A) -> I = { a -> this(a, b, c, d, e, f, g, h) }
