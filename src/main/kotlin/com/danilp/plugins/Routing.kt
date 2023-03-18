package com.danilp.plugins

import com.danilp.routs.freshDwellerRouting
import com.danilp.routs.freshPlantRouting
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        freshDwellerRouting()
        freshPlantRouting()
        static("/static") {
            resources("static")
        }
    }
}
