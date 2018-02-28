package org.throwable.springboot

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/2/28 11:17
 */
@SpringBootApplication
class KotlinSpringBootApplication : CommandLineRunner {

    override fun run(vararg args: String?) {
        println("Hello 'kotlin + springboot'!")
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinSpringBootApplication>(* args)
}