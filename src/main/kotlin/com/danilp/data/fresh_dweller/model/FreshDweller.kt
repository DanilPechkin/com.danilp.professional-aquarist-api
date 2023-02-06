package com.danilp.data.fresh_dweller.model

import kotlinx.serialization.Serializable

@Serializable
data class FreshDweller(
    var id: Long?,
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
