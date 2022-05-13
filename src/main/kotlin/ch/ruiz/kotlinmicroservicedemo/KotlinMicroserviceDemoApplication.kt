package ch.ruiz.kotlinmicroservicedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMicroserviceDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinMicroserviceDemoApplication>(*args)
}
