package me.mark.partikt

fun <A, B, C, D, E, F, G, H> id(fn: (A, B, C, D, E, F, G) -> H): (A, B, C, D, E, F, G) -> H = fn

inline operator fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).not() = rev(this)
inline fun <A, B, C, D, E, F, G, H> rev(crossinline fn: (A, B, C, D, E, F, G) -> H): (G, F, E, D, C, B, A) -> H = { g, f, e, d, c, b, a -> fn(a, b, c, d, e, f, g)}

inline operator fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).plus(a: A): (B, C, D, E, F, G) -> H = par(a)
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).par(a: A): (B, C, D, E, F, G) -> H = { b, c, d, e, f, g -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).par(a: A, b: B): (C, D, E, F, G) -> H = { c, d, e, f, g -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).par(a: A, b: B, c: C): (D, E, F, G) -> H = { d, e, f, g -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).par(a: A, b: B, c: C, d: D): (E, F, G) -> H = { e, f, g -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).par(a: A, b: B, c: C, d: D, e: E): (F, G) -> H = { f, g -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).par(a: A, b: B, c: C, d: D, e: E, f: F): (G) -> H = { g -> this(a, b, c, d, e, f, g) }

inline operator fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).minus(g: G): (A, B, C, D, E, F) -> H = rep(g)
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).rep(g: G): (A, B, C, D, E, F) -> H = { a, b, c, d, e, f -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).rep(f: F, g: G): (A, B, C, D, E) -> H = { a, b, c, d, e -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).rep(e: E, f: F, g: G): (A, B, C, D) -> H = { a, b, c, d -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).rep(d: D, e: E, f: F, g: G): (A, B, C) -> H = { a, b, c -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).rep(c: C, d: D, e: E, f: F, g: G): (A, B) -> H = { a, b -> this(a, b, c, d, e, f, g) }
inline fun <A, B, C, D, E, F, G, H> ((A, B, C, D, E, F, G) -> H).rep(b: B, c: C, d: D, e: E, f: F, g: G): (A) -> H = { a -> this(a, b, c, d, e, f, g) }
