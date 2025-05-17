package com.cdc.esupa.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController // Marks this class as a REST controller where every method returns a domain object instead of a view
class HelloController {

    @GetMapping("/")
    fun home(): String {
        // Returns a simple string as the response body
        return "Home"
    }
    // This function handles HTTP GET requests to the "/hello" path
    @GetMapping("/hello")
    fun sayHello(
        // Example of an optional request parameter: /hello?name=World
        @RequestParam(value = "name", defaultValue = "Guest") name: String
    ): String {
        // Returns a simple string as the response body
        return "Hello, $name! Welcome to your Spring Boot Kotlin app."
    }

    // You could add another handler for a different path
    @GetMapping("/greet")
    fun greet(): Map<String, String> {
        // Spring Boot automatically converts this Map to JSON
        return mapOf("message" to "Greetings from Spring Boot!")
    }
}