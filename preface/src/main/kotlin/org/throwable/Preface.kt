package org.throwable

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 11:06
 */
fun isOdd(value: Int) = value % 2 != 0

fun length(value: String) = value.length

fun <X, Y, Z> compose(f: (Y) -> Z, g: (X) -> Y): (X) -> Z {
    return { p -> f(g(p)) }
}

fun main(array: Array<String>){
    val oddLength = compose(::isOdd,:: length)
    val strings = listOf("a","ab","abc")
    println(strings.filter(oddLength))
}

