package com.cdc.esupa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan("com.esupa.storemodels.models") // Explicitly scan for entities
@EnableJpaRepositories("com.cdc.esupa.infra", "com.esupa.storemodels.models") // Include the package of your entities
@ComponentScan("com.cdc.esupa.service") // Explicitly scan for entities
class ESupaApplication

fun main(args: Array<String>) {
    runApplication<ESupaApplication>(*args)
}
