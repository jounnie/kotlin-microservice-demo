package ch.ruiz.kotlinmicroservicedemo

import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Supplier

@Configuration
class MessageBrokerConfiguration {

    private val log = LoggerFactory.getLogger(javaClass) // javaClass is the same as `Class.class`

    /**
     * automatically and continuously publish message based on the configured binder in
     * [application.yml](/application.yml) as this bean returns a supplier.
     *
     * see [kotlin uses kdoc instead of javadoc](https://kotlinlang.org/docs/kotlin-doc.html) which is basically markdown.
     */
    @Bean
    fun publishMessageAutomatically(): Supplier<String> {
        return Supplier {
            log.info("publishMessageAutomatically")
            "test"
        }
    }
}
