package org.throwable

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 11:13
 */
fun main(array: Array<String>) {
    println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()))
    println("Hello world!")
}
