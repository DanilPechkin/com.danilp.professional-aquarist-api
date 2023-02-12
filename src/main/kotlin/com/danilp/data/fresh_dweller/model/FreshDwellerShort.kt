package com.danilp.data.fresh_dweller.model

import kotlinx.serialization.Serializable

@Serializable
data class FreshDwellerShort(
    var id: Long?,
    val imageUrl: String?,
    val name: String?,
    val genus: String?
)