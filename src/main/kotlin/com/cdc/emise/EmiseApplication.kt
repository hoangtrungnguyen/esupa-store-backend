package com.cdc.emise

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmiseApplication

fun main(args: Array<String>) {
    runApplication<EmiseApplication>(*args)
}
