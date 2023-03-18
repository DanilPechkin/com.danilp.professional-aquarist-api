package com.danilp.routs

import com.danilp.data.fresh_plant.freshPlantListEn
import com.danilp.data.fresh_plant.freshPlantListRu
import com.danilp.data.fresh_plant.model.toShort
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.freshPlantRouting() {
    route("/fresh_plant") {
        get {
            call.respond(
                when (call.request.queryParameters["lang"] ?: "en") {
                    "en" -> freshPlantListEn.map { it.toShort() }
                    "ru" -> freshPlantListRu.map { it.toShort() }
                    else -> freshPlantListEn.map { it.toShort() }
                }
            )
        }
        get("{id}") {
            val id = call.parameters["id"]?.toLongOrNull()
            if (id == null) {
                call.respondText("Missing id", status = HttpStatusCode.BadRequest)
                return@get
            }
            val freshPlant = when (call.request.queryParameters["lang"] ?: "en") {
                "en" -> freshPlantListEn
                "ru" -> freshPlantListRu
                else -> freshPlantListEn
            }.find { it.id == id }
            if (freshPlant == null) {
                call.respondText("Plant not found", status = HttpStatusCode.NotFound)
            } else {
                call.respond(freshPlant)
            }
        }
    }
}