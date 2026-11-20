package com.victoria.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlashDropApplication

fun main(args: Array<String>) {
	runApplication<FlashDropApplication>(*args)
}
