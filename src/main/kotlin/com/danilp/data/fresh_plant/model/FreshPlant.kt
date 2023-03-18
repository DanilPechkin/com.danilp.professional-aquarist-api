package com.danilp.data.fresh_plant.model

import kotlinx.serialization.Serializable

@Serializable
data class FreshPlant(
    val id: Long?,
    val imageUrls: List<String>?,
    val name: String?,
    val genus: String?,
    val minTemperature: Double?,
    val maxTemperature: Double?,
    val minPh: Double?, // Acidity
    val maxPh: Double?,
    val minGh: Double?, // Rigidity
    val maxGh: Double?,
    val minKh: Double?,
    val maxKh: Double?,
    val minCO2: Double?,
    val maxCO2: Double?,
    val minIllumination: Double?,
    val maxIllumination: Double?,
    val description: String?,
    val tags: List<String>?
)

@Serializable
data class FreshPlantShort(
    var id: Long?,
    val imageUrl: String?,
    val name: String?,
    val genus: String?
)

fun FreshPlant.toShort() = FreshPlantShort(
    id = id,
    imageUrl = imageUrls?.randomOrNull(),
    name = name,
    genus = genus
)