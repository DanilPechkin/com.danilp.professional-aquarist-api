package com.danilp.routs

import com.danilp.data.fresh_dweller.model.FreshDweller
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.freshDwellerRouting() {
    route("/freshDweller") {
        get {
            call.respond(freshDwellerList)
        }
        get("{id}") {
            val id = call.parameters["id"]?.toLongOrNull()
            if (id == null) {
                call.respondText("Missing id", status = HttpStatusCode.BadRequest)
                return@get
            }
            val freshDweller = freshDwellerList.find { it.id == id }
            if (freshDweller == null) {
                call.respondText("Dweller not found", status = HttpStatusCode.NotFound)
            } else {
                call.respond(freshDweller)
            }
        }
    }
}

private const val BASE_URL = "http://192.168.0.106:8080"

val freshDwellerList = listOf(
    FreshDweller(
        id = 1,
        imageUrl = "$BASE_URL/fresh_dweller/pterophyllum_scalare.jpg",
        name = "Angel Fish",
        type = "Fish",
        genus = "Pterophyllum scalare",
        minTemperature = 24.0,
        maxTemperature = 30.0,
        liters = 1.0,
        minPh = 6.0,
        maxPh = 8.0,
        minGh = 5.0,
        maxGh = 13.0,
        minKh = null,
        maxKh = null,
        description = "description"
    )
)
