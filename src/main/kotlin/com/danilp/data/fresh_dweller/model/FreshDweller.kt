package com.danilp.data.fresh_dweller.model

import kotlinx.serialization.Serializable

@Serializable
data class FreshDweller(
    val id: Long?,
    val imageUrls: List<String>?,
    val name: String?,
    val genus: String?,
    val minTemperature: Double?,
    val maxTemperature: Double?,
    val liters: Double?,
    val minPh: Double?,
    val maxPh: Double?,
    val minGh: Double?,
    val maxGh: Double?,
    val minKh: Double?,
    val maxKh: Double?,
    val description: String?,
    val tags: List<String>?
)

@Serializable
data class FreshDwellerShort(
    var id: Long?,
    val imageUrl: String?,
    val name: String?,
    val genus: String?
)

fun FreshDweller.toShort() = FreshDwellerShort(
    id = id,
    imageUrl = imageUrls?.randomOrNull(),
    name = name,
    genus = genus
)