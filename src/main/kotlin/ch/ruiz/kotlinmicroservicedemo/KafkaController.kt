package ch.ruiz.kotlinmicroservicedemo

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/kafka")
class KafkaController(private val eventProducer: EventProducer) {

    @PostMapping("/publishTestMessage")
    fun publishTestMessage(@RequestBody message: String) = eventProducer.send(message)
}
