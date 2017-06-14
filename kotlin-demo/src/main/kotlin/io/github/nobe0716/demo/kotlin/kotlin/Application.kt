package io.github.nobe0716.demo.kotlin.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 *
 *
 * @author @sunghyo.jung
 */
@SpringBootApplication
open class Application {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}