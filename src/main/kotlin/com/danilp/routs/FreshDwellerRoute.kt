package com.danilp.routs

import com.danilp.data.fresh_dweller.freshDwellerListEn
import com.danilp.data.fresh_dweller.freshDwellerListRu
import com.danilp.data.fresh_dweller.model.toShort
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.freshDwellerRouting() {
    route("/fresh_dweller") {
        get {
            call.respond(
                when (call.request.queryParameters["lang"] ?: "en") {
                    "en" -> freshDwellerListEn.map { it.toShort() }
                    "ru" -> freshDwellerListRu.map { it.toShort() }
                    else -> freshDwellerListEn.map { it.toShort() }
                }
            )
        }
        get("{id}") {
            val id = call.parameters["id"]?.toLongOrNull()
            if (id == null) {
                call.respondText("Missing id", status = HttpStatusCode.BadRequest)
                return@get
            }
            val freshDweller = when (call.request.queryParameters["lang"] ?: "en") {
                "en" -> freshDwellerListEn
                "ru" -> freshDwellerListRu
                else -> freshDwellerListEn
            }.find { it.id == id }
            if (freshDweller == null) {
                call.respondText("Dweller not found", status = HttpStatusCode.NotFound)
            } else {
                call.respond(freshDweller)
            }
        }
    }
}

const val BASE_URL = "http://0.0.0.0:8080"