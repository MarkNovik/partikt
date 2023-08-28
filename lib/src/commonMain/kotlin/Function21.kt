package me.mark.partikt

fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> id(fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = fn

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).not() = rev(this)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> rev(crossinline fn: (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V): (U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A) -> V = { u, t, s, r, q, p, o, n, m, l, k, j, i, h, g, f, e, d, c, b, a -> fn(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u)}

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).plus(a: A): (B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = par(a)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A): (B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B): (C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C): (D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D): (E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E): (F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F): (G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { g, h, i, j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G): (H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { h, i, j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H): (I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { i, j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I): (J, K, L, M, N, O, P, Q, R, S, T, U) -> V = { j, k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J): (K, L, M, N, O, P, Q, R, S, T, U) -> V = { k, l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K): (L, M, N, O, P, Q, R, S, T, U) -> V = { l, m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L): (M, N, O, P, Q, R, S, T, U) -> V = { m, n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M): (N, O, P, Q, R, S, T, U) -> V = { n, o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N): (O, P, Q, R, S, T, U) -> V = { o, p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O): (P, Q, R, S, T, U) -> V = { p, q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P): (Q, R, S, T, U) -> V = { q, r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q): (R, S, T, U) -> V = { r, s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R): (S, T, U) -> V = { s, t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S): (T, U) -> V = { t, u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).par(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T): (U) -> V = { u -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }

inline operator fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).minus(u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T) -> V = rep(u)
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T) -> V = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S) -> V = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R) -> V = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q) -> V = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P) -> V = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M, N, O) -> V = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M, N) -> V = { a, b, c, d, e, f, g, h, i, j, k, l, m, n -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K, L, M) -> V = { a, b, c, d, e, f, g, h, i, j, k, l, m -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K, L) -> V = { a, b, c, d, e, f, g, h, i, j, k, l -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J, K) -> V = { a, b, c, d, e, f, g, h, i, j, k -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I, J) -> V = { a, b, c, d, e, f, g, h, i, j -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H, I) -> V = { a, b, c, d, e, f, g, h, i -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G, H) -> V = { a, b, c, d, e, f, g, h -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F, G) -> V = { a, b, c, d, e, f, g -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E, F) -> V = { a, b, c, d, e, f -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D, E) -> V = { a, b, c, d, e -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C, D) -> V = { a, b, c, d -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B, C) -> V = { a, b, c -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A, B) -> V = { a, b -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }
inline fun <A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> ((A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U) -> V).rep(b: B, c: C, d: D, e: E, f: F, g: G, h: H, i: I, j: J, k: K, l: L, m: M, n: N, o: O, p: P, q: Q, r: R, s: S, t: T, u: U): (A) -> V = { a -> this(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u) }