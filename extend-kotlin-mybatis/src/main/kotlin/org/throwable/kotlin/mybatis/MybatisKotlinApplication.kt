package org.throwable.kotlin.mybatis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 16:59
 */
@SpringBootApplication
class MybatisKotlinApplication

fun main(vararg args: String) {
    runApplication<MybatisKotlinApplication>(* args)
}