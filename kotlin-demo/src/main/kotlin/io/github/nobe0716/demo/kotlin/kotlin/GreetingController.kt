package io.github.nobe0716.demo.kotlin.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 *
 *
 * @author @sunghyo.jung
 */
@RestController
class GreetingController {
    val counter = java.util.concurrent.atomic.AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello, $name")
    }
}