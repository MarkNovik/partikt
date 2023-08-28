package me.mark.partikt

fun <A, B, C, D, E, F, G, H, I, J, K, L, M> id(fn: (A, B, C, D, E, F, G, H, I, J, K, L) -> M): (A, B, C, D, E, F, G, H, I, J, K, L) -> M = fn

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).not() = rev(this)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> rev(crossinline fn: (A, B, C, D, E, F, G, H, I, J, K, L) -> M): (L, K, J, I, H, G, F, E, D, C, B, A) -> M = { l, k, j, i, h, g, f, e, d, c, b, a -> fn(a, b, c, d, e, f, g, h, i, j, k, l)}

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).plus(a: A): (B, C, D, E, F, G, H, I, J, K, L) -> M = par(a)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A): (B, C, D, E, F, G, H, I, J, K, L) -> M = { b, c, d, e, f, g, h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B): (C, D, E, F, G, H, I, J, K, L) -> M = { c, d, e, f, g, h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C): (D, E, F, G, H, I, J, K, L) -> M = { d, e, f, g, h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C, d: D): (E, F, G, H, I, J, K, L) -> M = { e, f, g, h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C, d: D, e: E): (F, G, H, I, J, K, L) -> M = { f, g, h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C, d: D, e: E, f: F): (G, H, I, J, K, L) -> M = { g, h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G): (H, I, J, K, L) -> M = { h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H): (I, J, K, L) -> M = { i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I): (J, K, L) -> M = { j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J): (K, L) -> M = { k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K): (L) -> M = { l -> this(a, b, c, d, e, f, g, h, i, j, k, l) }

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).minus(l: L): (A, B, C, D, E, F, G, H, I, J, K) -> M = rep(l)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(l: L): (A, B, C, D, E, F, G, H, I, J, K) -> M = { a, b, c, d, e, f, g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(k: K, l: L): (A, B, C, D, E, F, G, H, I, J) -> M = { a, b, c, d, e, f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(j: J, k: K, l: L): (A, B, C, D, E, F, G, H, I) -> M = { a, b, c, d, e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(i: I, j: J, k: K, l: L): (A, B, C, D, E, F, G, H) -> M = { a, b, c, d, e, f, g, h -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(h: H, i: I, j: J, k: K, l: L): (A, B, C, D, E, F, G) -> M = { a, b, c, d, e, f, g -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(g: G, h: H, i: I, j: J, k: K, l: L): (A, B, C, D, E, F) -> M = { a, b, c, d, e, f -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(f: F, g: G, h: H, i: I, j: J, k: K, l: L): (A, B, C, D, E) -> M = { a, b, c, d, e -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L): (A, B, C, D) -> M = { a, b, c, d -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L): (A, B, C) -> M = { a, b, c -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L): (A, B) -> M = { a, b -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M> ((A, B, C, D, E, F, G, H, I, J, K, L) -> M).rep(b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L): (A) -> M = { a -> this(a, b, c, d, e, f, g, h, i, j, k, l) }
