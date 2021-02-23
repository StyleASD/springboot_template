package hello

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class Application {
    @Bean
    open fun commandLineRunner(ctx: ApplicationContext) = CommandLineRunner {
        println("Your Kotlin Spring Boot app is loaded")
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

