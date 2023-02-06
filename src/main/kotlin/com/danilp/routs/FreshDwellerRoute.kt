package com.danilp.routs

import com.danilp.data.fresh_dweller.freshDwellerList
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.freshDwellerRouting() {
    route("/fresh_dweller") {
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

const val BASE_URL = "http://192.168.3.15:8080"