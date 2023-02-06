package com.danilp.data.fresh_dweller

import com.danilp.data.fresh_dweller.model.FreshDweller
import com.danilp.data.fresh_dweller.model.Tags
import com.danilp.routs.BASE_URL

val freshDwellerList = listOf(
    FreshDweller(
        id = 1,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/pterophyllum_scalare.jpg"),
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
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/neon_tetra.jpg"),
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
            Tags.OMNIVOROUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 3,
        imageUrls = null,
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
            Tags.OMNIVOROUS,
            Tags.POLYGAMOUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 4,
        imageUrls = null,
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
            Tags.OMNIVOROUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 5,
        imageUrls = null,
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
            Tags.NEEDS_SMOOTH_SURFACES,
            Tags.POLYGAMOUS,
            Tags.OMNIVOROUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 6,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/cardinal_tetra.jpg"),
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
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER,
            Tags.LOW_LIGHT
        )
    ),
    FreshDweller(
        id = 7,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/black_neon_tetra.jpg"),
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
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER,
            Tags.LOW_LIGHT
        )
    ),
    FreshDweller(
        id = 8,
        imageUrls = null,
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
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.FAST_CURRENT
        )
    ),
    FreshDweller(
        id = 9,
        imageUrls = null,
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
            Tags.OMNIVOROUS,
            Tags.OVIPAROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 10,
        imageUrls = null,
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
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 11,
        imageUrls = null,
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
            Tags.OMNIVOROUS,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER
        )
    ),

    // Livebearers

    FreshDweller(
        id = 12,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/guppy.jpg"),
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
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER,
            Tags.FLOATING_PLANT
        )
    ),
    FreshDweller(
        id = 13,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/endlers_livebearer.jpg"),
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
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER,
            Tags.FLOATING_PLANT
        )
    ),
    FreshDweller(
        id = 14,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/common_molly.jpg"),
        name = "Common molly",
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
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 15,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/sailfin_molly.jpg"),
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
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 16,
        imageUrls = null,
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
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.FISH,
            Tags.SHOAL
        )
    ),
    FreshDweller(
        id = 17,
        imageUrls = null,
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
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.FISH,
            Tags.SHOAL,
            Tags.PLANT_LOVER
        )
    ),

    // Snails

    FreshDweller(
        id = 18,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/apple_snail.jpg"),
        name = "Spike-topped apple snail",
        genus = "Pomacea bridgesii",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = 10.0,
        minPh = 6.5,
        maxPh = 7.8,
        minGh = 8.0,
        maxGh = 18.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.PLANT_LOVER,
            Tags.BROADLEAF_PLANT,
            Tags.CLEANER,
            Tags.NEEDS_SMOOTH_SURFACES
        )
    ),

    FreshDweller(
        id = 19,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/apple_snail.jpg"),
        name = "Apple snail",
        genus = "Pomacea canaliculata",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = 10.0,
        minPh = 6.5,
        maxPh = 7.8,
        minGh = 8.0,
        maxGh = 18.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.PLANT_LOVER,
            Tags.BROADLEAF_PLANT,
            Tags.CLEANER,
            Tags.NEEDS_SMOOTH_SURFACES
        )
    ),

    FreshDweller(
        id = 20,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/apple_snail.jpg"),
        name = "Giant apple snail",
        genus = "Pomacea maculata",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = 10.0,
        minPh = 6.5,
        maxPh = 7.8,
        minGh = 8.0,
        maxGh = 18.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.PLANT_LOVER,
            Tags.BROADLEAF_PLANT,
            Tags.CLEANER,
            Tags.NEEDS_SMOOTH_SURFACES
        )
    ),

    FreshDweller(
        id = 21,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/apple_snail.jpg"),
        name = "Florida apple snail",
        genus = "Pomacea paludosa",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = 10.0,
        minPh = 6.5,
        maxPh = 7.8,
        minGh = 8.0,
        maxGh = 18.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.PLANT_LOVER,
            Tags.BROADLEAF_PLANT,
            Tags.CLEANER,
            Tags.NEEDS_SMOOTH_SURFACES
        )
    ),

    FreshDweller(
        id = 22,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/ramshorn_snail.jpg"),
        name = "Ramshorn snail",
        genus = "Planorbidae",
        minTemperature = 22.0,
        maxTemperature = 28.0,
        liters = null,
        minPh = null,
        maxPh = null,
        minGh = null,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 23,
        imageUrls = null,
        name = "Colombian Giant Ramshorn Snail",
        genus = "Marisa cornuarietis",
        minTemperature = 21.0,
        maxTemperature = 25.0,
        liters = 10.0,
        minPh = 7.5,
        maxPh = 8.0,
        minGh = 8.0,
        maxGh = 25.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.SNAIL,
            Tags.MEDIUM,
            Tags.OMNIVOROUS,
            Tags.PLANT_EATER,
            Tags.OVIPAROUS,
            Tags.POLYGAMOUS,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 24,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/melania.jpg"),
        name = "Melania",
        genus = "Melanoides",
        minTemperature = 18.0,
        maxTemperature = 28.0,
        liters = null,
        minPh = null,
        maxPh = null,
        minGh = null,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 25,
        imageUrls = null,
        name = "Neritina",
        genus = "Neritina",
        minTemperature = 22.0,
        maxTemperature = 27.0,
        liters = 8.0,
        minPh = 7.5,
        maxPh = 8.0,
        minGh = 6.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 26,
        imageUrls = null,
        name = "Neritina zebra",
        genus = "Vittina natalensis",
        minTemperature = 22.0,
        maxTemperature = 27.0,
        liters = 8.0,
        minPh = 7.5,
        maxPh = 8.0,
        minGh = 6.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 27,
        imageUrls = null,
        name = "Neritina turrita",
        genus = "Vittina turrita",
        minTemperature = 22.0,
        maxTemperature = 27.0,
        liters = 8.0,
        minPh = 7.5,
        maxPh = 8.0,
        minGh = 6.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 28,
        imageUrls = null,
        name = "Olive Nerite Snail",
        genus = "Vitta usnea",
        minTemperature = 22.0,
        maxTemperature = 27.0,
        liters = 8.0,
        minPh = 7.5,
        maxPh = 8.0,
        minGh = 6.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    )

    )
