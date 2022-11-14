package com.danilp.routs

import com.danilp.data.fresh_dweller.model.FreshDweller
import com.danilp.data.fresh_dweller.model.Tags
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

private const val BASE_URL = "http://192.168.3.15:8080"

val freshDwellerList = listOf(
    FreshDweller(
        id = 1,
        imageUrl = "$BASE_URL/static/fresh_dweller/pterophyllum_scalare.jpg",
        name = "Angelfish",
        genus = "Pterophyllum scalare",
        minTemperature = 24.0,
        maxTemperature = 30.0,
        liters = 50.0,
        minPh = 6.0,
        maxPh = 8.0,
        minGh = 5.0,
        maxGh = 13.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PREDATOR,
            Tags.CARNIVOROUS,
            Tags.MONOGAMOUS,
            Tags.OVIPAROUS,
            Tags.BIG,
            Tags.FISH,
            Tags.PLANT_LOVER,
            Tags.BROADLEAF_PLANT,
            Tags.LONG_STEMMED_PLANT,
            Tags.SLOW_CURRENT
        )
    ),
    FreshDweller(
        id = 2,
        imageUrl = null,
        name = "Neon tetra",
        genus = "Paracheirodon innesi",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 3.0,
        minPh = 6.0,
        maxPh = 6.5,
        minGh = null,
        maxGh = 12.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 3,
        imageUrl = null,
        name = "Gold neon tetra",
        genus = "Paracheirodon innesi var Gold",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 3.0,
        minPh = 6.0,
        maxPh = 6.5,
        minGh = null,
        maxGh = 12.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 4,
        imageUrl = null,
        name = "Diamond neon tetra",
        genus = "Paracheirodon innesi diamond",
        minTemperature = 22.0,
        maxTemperature = 26.0,
        liters = 3.0,
        minPh = 5.0,
        maxPh = 7.0,
        minGh = 5.0,
        maxGh = 10.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 5,
        imageUrl = null,
        name = "Veil-tailed neon tetra",
        genus = "Paracheirodon innesi",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 3.0,
        minPh = 6.0,
        maxPh = 6.5,
        minGh = null,
        maxGh = 12.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.VEIL_TAILED,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 6,
        imageUrl = null,
        name = "Cardinal tetra",
        genus = "Paracheirodon axelrodi",
        minTemperature = 23.0,
        maxTemperature = 26.0,
        liters = 5.0,
        minPh = 6.0,
        maxPh = 7.0,
        minGh = null,
        maxGh = 5.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER,
            Tags.LOW_LIGHT
        )
    ),
    FreshDweller(
        id = 7,
        imageUrl = null,
        name = "Black neon tetra",
        genus = "Hyphessobrycon herbertaxelrodi",
        minTemperature = 24.0,
        maxTemperature = 28.0,
        liters = 4.0,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 10.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER,
            Tags.LOW_LIGHT
        )
    ),
    FreshDweller(
        id = 8,
        imageUrl = null,
        name = "January tetra",
        genus = "Hemigrammus hyanuary",
        minTemperature = 22.0,
        maxTemperature = 26.0,
        liters = 4.0,
        minPh = 5.0,
        maxPh = 6.0,
        minGh = 2.0,
        maxGh = 8.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.FAST_CURRENT
        )
    ),
    FreshDweller(
        id = 9,
        imageUrl = null,
        name = "Savanna tetra",
        genus = "Hyphessobrycon stegemanni",
        minTemperature = 20.0,
        maxTemperature = 25.0,
        liters = 3.0,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 1.0,
        maxGh = 12.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 10,
        imageUrl = null,
        name = "Glowlight tetra",
        genus = "Hemigrammus erythrozonus",
        minTemperature = 22.0,
        maxTemperature = 28.0,
        liters = 5.0,
        minPh = 6.0,
        maxPh = 7.5,
        minGh = 6.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 11,
        imageUrl = null,
        name = "Green neon tetra",
        genus = "Paracheirodon simulans",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 3.0,
        minPh = 5.5,
        maxPh = 6.0,
        minGh = 0.0,
        maxGh = 4.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER
        )
    ),

    // Livebearers

    FreshDweller(
        id = 12,
        imageUrl = null,
        name = "Guppy",
        genus = "Poecilia reticulata",
        minTemperature = 24.0,
        maxTemperature = 26.0,
        liters = 4.0,
        minPh = 7.0,
        maxPh = 8.5,
        minGh = 10.0,
        maxGh = 25.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.LIVEBEARER,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER,
            Tags.FLOATING_PLANT
        )
    ),
    FreshDweller(
        id = 13,
        imageUrl = null,
        name = "Endler's livebearer",
        genus = "Poecilia wingei",
        minTemperature = 24.0,
        maxTemperature = 30.0,
        liters = 4.0,
        minPh = 7.0,
        maxPh = 8.5,
        minGh = 15.0,
        maxGh = 35.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.LIVEBEARER,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER,
            Tags.FLOATING_PLANT
        )
    ),
    FreshDweller(
        id = 14,
        imageUrl = null,
        name = "Black molly",
        genus = "Poecilia sphenops",
        minTemperature = 25.0,
        maxTemperature = 28.0,
        liters = 5.0,
        minPh = 7.0,
        maxPh = 8.5,
        minGh = 15.0,
        maxGh = 30.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.LIVEBEARER,
            Tags.MEDIUM,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 15,
        imageUrl = null,
        name = "Sailfin molly",
        genus = "Poecilia latipinna",
        minTemperature = 24.0,
        maxTemperature = 26.0,
        liters = 5.0,
        minPh = 7.5,
        maxPh = 8.0,
        minGh = 15.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.LIVEBEARER,
            Tags.MEDIUM,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 16,
        imageUrl = null,
        name = "Giant sailfin molly",
        genus = "Poecilia velifera",
        minTemperature = 24.0,
        maxTemperature = 27.0,
        liters = 6.0,
        minPh = 7.0,
        maxPh = 8.5,
        minGh = 8.0,
        maxGh = 25.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.LIVEBEARER,
            Tags.MEDIUM,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 17,
        imageUrl = null,
        name = "Liberty molly",
        genus = "Poecilia salvatoris",
        minTemperature = 22.0,
        maxTemperature = 28.0,
        liters = 6.0,
        minPh = 7.0,
        maxPh = 7.5,
        minGh = 12.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.LIVEBEARER,
            Tags.MEDIUM,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER
        )
    )
)
