package me.mark.partikt

fun <A, B, C, D, E, F, G, H, I, J, K, L> id(fn: (A, B, C, D, E, F, G, H, I, J, K) -> L): (A, B, C, D, E, F, G, H, I, J, K) -> L = fn

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).not() = rev(this)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> rev(crossinline fn: (A, B, C, D, E, F, G, H, I, J, K) -> L): (K, J, I, H, G, F, E, D, C, B, A) -> L = { k, j, i, h, g, f, e, d, c, b, a -> fn(a, b, c, d, e, f, g, h, i, j, k)}

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).plus(a: A): (B, C, D, E, F, G, H, I, J, K) -> L = par(a)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A): (B, C, D, E, F, G, H, I, J, K) -> L = { b, c, d, e, f, g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B): (C, D, E, F, G, H, I, J, K) -> L = { c, d, e, f, g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B, c: C): (D, E, F, G, H, I, J, K) -> L = { d, e, f, g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B, c: C, d: D): (E, F, G, H, I, J, K) -> L = { e, f, g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B, c: C, d: D, e: E): (F, G, H, I, J, K) -> L = { f, g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B, c: C, d: D, e: E, f: F): (G, H, I, J, K) -> L = { g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G): (H, I, J, K) -> L = { h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H): (I, J, K) -> L = { i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I): (J, K) -> L = { j, k -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J): (K) -> L = { k -> this(a, b, c, d, e, f, g, h, i, j, k) }

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).minus(k: K): (A, B, C, D, E, F, G, H, I, J) -> L = rep(k)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(k: K): (A, B, C, D, E, F, G, H, I, J) -> L = { a, b, c, d, e, f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(j: J, k: K): (A, B, C, D, E, F, G, H, I) -> L = { a, b, c, d, e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(i: I, j: J, k: K): (A, B, C, D, E, F, G, H) -> L = { a, b, c, d, e, f, g, h -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(h: H, i: I, j: J, k: K): (A, B, C, D, E, F, G) -> L = { a, b, c, d, e, f, g -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(g: G, h: H, i: I, j: J, k: K): (A, B, C, D, E, F) -> L = { a, b, c, d, e, f -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(f: F, g: G, h: H, i: I, j: J, k: K): (A, B, C, D, E) -> L = { a, b, c, d, e -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(e: E, f: F, g: G, h: H, i: I, j: J, k: K): (A, B, C, D) -> L = { a, b, c, d -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K): (A, B, C) -> L = { a, b, c -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K): (A, B) -> L = { a, b -> this(a, b, c, d, e, f, g, h, i, j, k) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L> ((A, B, C, D, E, F, G, H, I, J, K) -> L).rep(b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K): (A) -> L = { a -> this(a, b, c, d, e, f, g, h, i, j, k) }
