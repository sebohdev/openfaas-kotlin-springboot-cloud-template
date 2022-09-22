package com.resist.it.openfaas.function

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import java.util.function.Function

@Component
class SimpleFunction {

    @Bean
    fun hello(): () -> String {
        return { "Hello" }
    }

    @Bean
    fun upperCase(): (String) -> String {
        return { it.uppercase() }
    }
}