package me.mark.partikt

fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> id(fn: (A, B, C, D, E, F, G, H, I, J, K, L, M) -> N): (A, B, C, D, E, F, G, H, I, J, K, L, M) -> N = fn

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).not() = rev(this)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> rev(crossinline fn: (A, B, C, D, E, F, G, H, I, J, K, L, M) -> N): (M, L, K, J, I, H, G, F, E, D, C, B, A) -> N = { m, l, k, j, i, h, g, f, e, d, c, b, a -> fn(a, b, c, d, e, f, g, h, i, j, k, l, m)}

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).plus(a: A): (B, C, D, E, F, G, H, I, J, K, L, M) -> N = par(a)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A): (B, C, D, E, F, G, H, I, J, K, L, M) -> N = { b, c, d, e, f, g, h, i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B): (C, D, E, F, G, H, I, J, K, L, M) -> N = { c, d, e, f, g, h, i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C): (D, E, F, G, H, I, J, K, L, M) -> N = { d, e, f, g, h, i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D): (E, F, G, H, I, J, K, L, M) -> N = { e, f, g, h, i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D, e: E): (F, G, H, I, J, K, L, M) -> N = { f, g, h, i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D, e: E, f: F): (G, H, I, J, K, L, M) -> N = { g, h, i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G): (H, I, J, K, L, M) -> N = { h, i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H): (I, J, K, L, M) -> N = { i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I): (J, K, L, M) -> N = { j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J): (K, L, M) -> N = { k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K): (L, M) -> N = { l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L): (M) -> N = { m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).minus(m: M): (A, B, C, D, E, F, G, H, I, J, K, L) -> N = rep(m)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(m: M): (A, B, C, D, E, F, G, H, I, J, K, L) -> N = { a, b, c, d, e, f, g, h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(l: L, m: M): (A, B, C, D, E, F, G, H, I, J, K) -> N = { a, b, c, d, e, f, g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(k: K, l: L, m: M): (A, B, C, D, E, F, G, H, I, J) -> N = { a, b, c, d, e, f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(j: J, k: K, l: L, m: M): (A, B, C, D, E, F, G, H, I) -> N = { a, b, c, d, e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(i: I, j: J, k: K, l: L, m: M): (A, B, C, D, E, F, G, H) -> N = { a, b, c, d, e, f, g, h -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(h: H, i: I, j: J, k: K, l: L, m: M): (A, B, C, D, E, F, G) -> N = { a, b, c, d, e, f, g -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(g: G, h: H, i: I, j: J, k: K, l: L, m: M): (A, B, C, D, E, F) -> N = { a, b, c, d, e, f -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M): (A, B, C, D, E) -> N = { a, b, c, d, e -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M): (A, B, C, D) -> N = { a, b, c, d -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M): (A, B, C) -> N = { a, b, c -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M): (A, B) -> N = { a, b -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N> ((A, B, C, D, E, F, G, H, I, J, K, L, M) -> N).rep(b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M): (A) -> N = { a -> this(a, b, c, d, e, f, g, h, i, j, k, l, m) }
