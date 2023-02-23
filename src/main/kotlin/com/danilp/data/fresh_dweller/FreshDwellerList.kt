package com.danilp.data.fresh_dweller

import com.danilp.data.fresh_dweller.model.FreshDweller
import com.danilp.data.fresh_dweller.model.Tags
import com.danilp.routs.BASE_URL

// 50

val freshDwellerListEn = listOf(
    FreshDweller(
        id = 1,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/pterophyllum_scalare_1.jpg",
            "${BASE_URL}/static/fresh_dweller/pterophyllum_scalare_2.jpg",
            "${BASE_URL}/static/fresh_dweller/pterophyllum_scalare_3.jpg",
        ),
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
        description = "These snails can breathe not only oxygen dissolved in water, but also atmospheric air. They must have the opportunity to breathe atmospheric air. These snails are dioecious, but it is very difficult to distinguish a female from a male. They lay their eggs on dry land. Their eggs need moist air to incubate.",
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
        description = "These snails can breathe not only oxygen dissolved in water, but also atmospheric air. They must have the opportunity to breathe atmospheric air. These snails are dioecious, but it is very difficult to distinguish a female from a male. They lay their eggs on dry land. Their eggs need moist air to incubate.",
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
        description = "These snails can breathe not only oxygen dissolved in water, but also atmospheric air. They must have the opportunity to breathe atmospheric air. These snails are dioecious, but it is very difficult to distinguish a female from a male. They lay their eggs on dry land. Their eggs need moist air to incubate.",
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
        description = "These snails can breathe not only oxygen dissolved in water, but also atmospheric air. They must have the opportunity to breathe atmospheric air. These snails are dioecious, but it is very difficult to distinguish a female from a male. They lay their eggs on dry land. Their eggs need moist air to incubate.",
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
        id = 38,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/apple_snail.jpg"),
        name = "The Apple Snail",
        genus = "Ampullariidae",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = 10.0,
        minPh = 6.5,
        maxPh = 7.8,
        minGh = 8.0,
        maxGh = 18.0,
        minKh = null,
        maxKh = null,
        description = "These snails can breathe not only oxygen dissolved in water, but also atmospheric air. They must have the opportunity to breathe atmospheric air. These snails are dioecious, but it is very difficult to distinguish a female from a male. They lay their eggs on dry land. Their eggs need moist air to incubate.",
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
        description = "If Planorbidae reproduce very quickly, then there is too much food in the aquarium. These snails can breathe in two ways - using oxygen dissolved in water and atmospheric air. These snails are detritivores, they clean the aquarium from organic debris.",
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
        description = "These snails are able to breathe not only oxygen dissolved in water, but also atmospheric air. They must have the opportunity to breathe atmospheric air. These snails are dioecious, the females have a dark body, and the males are light. For the reproduction of these snails, the water temperature must be several degrees warmer than a comfortable value. They lay their eggs on aquarium decorations.",
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
        description = "These snails are detritivores, they clean the aquarium from organic debris. They love to be in the bottom of the aquarium. If all the snails crawl out of the ground, then the concentration of oxygen dissolved in the water is too low.",
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
        description = "These snails are good at eating algae without damaging aquarium plants. They do not tolerate sudden changes in water parameters. If this snail has fallen, then it will be very difficult for it to roll over on its own. Sometimes they stop in one place and do not move for a long time, this is normal. These snails are dioecious, but it is impossible to distinguish the female from the male. They lay their eggs on aquarium decorations, but for incubation, the eggs must be transferred to a saltwater aquarium.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
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
        description = "These snails are good at eating algae without damaging aquarium plants. They do not tolerate sudden changes in water parameters. If this snail has fallen, then it will be very difficult for it to roll over on its own. Sometimes they stop in one place and do not move for a long time, this is normal. These snails are dioecious, but it is impossible to distinguish the female from the male. They lay their eggs on aquarium decorations, but for incubation, the eggs must be transferred to a saltwater aquarium.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
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
        description = "These snails are good at eating algae without damaging aquarium plants. They do not tolerate sudden changes in water parameters. If this snail has fallen, then it will be very difficult for it to roll over on its own. Sometimes they stop in one place and do not move for a long time, this is normal. These snails are dioecious, but it is impossible to distinguish the female from the male. They lay their eggs on aquarium decorations, but for incubation, the eggs must be transferred to a saltwater aquarium.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
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
        description = "These snails are good at eating algae without damaging aquarium plants. They do not tolerate sudden changes in water parameters. If this snail has fallen, then it will be very difficult for it to roll over on its own. Sometimes they stop in one place and do not move for a long time, this is normal. These snails are dioecious, but it is impossible to distinguish the female from the male. They lay their eggs on aquarium decorations, but for incubation, the eggs must be transferred to a saltwater aquarium.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 29,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/ear_pond_snail_1.jpg",
            "${BASE_URL}/static/fresh_dweller/ear_pond_snail_2.jpg"
        ),
        name = "Ear pond snail",
        genus = "Radix",
        minTemperature = 22.0,
        maxTemperature = 28.0,
        liters = null,
        minPh = 6.0,
        maxPh = 8.0,
        minGh = 8.0,
        maxGh = 10.0,
        minKh = null,
        maxKh = null,
        description = "These snails love to eat algae without damaging aquarium plants. If these snails reproduce very quickly, then there is too much food in the aquarium.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 30,
        imageUrls = null,
        name = "Thorn nerite snail",
        genus = "Clithon",
        minTemperature = 24.0,
        maxTemperature = 26.0,
        liters = 3.0,
        minPh = 7.0,
        maxPh = null,
        minGh = 10.0,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = "These snails are good at eating algae without damaging aquarium plants. They do not tolerate sudden changes in water parameters. If this snail has fallen, then it will be very difficult for it to roll over on its own. Sometimes they stop in one place and do not move for a long time, this is normal. These snails are dioecious, but it is impossible to distinguish the female from the male. They lay their eggs on aquarium decorations, but for incubation, the eggs must be transferred to a saltwater aquarium.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 31,
        imageUrls = null,
        name = "Rabbit snail",
        genus = "Tylomelania insulaesacrae",
        minTemperature = 27.0,
        maxTemperature = 30.0,
        liters = 10.0,
        minPh = 7.5,
        maxPh = 8.5,
        minGh = 5.0,
        maxGh = 7.0,
        minKh = null,
        maxKh = null,
        description = "For the comfort of these snails, sandy soil with large stones as decorations is suitable. These snails eat a lot, they need to be fed at least 2 times a day. They are dioecious, but it is impossible to distinguish males from females.",
        tags = listOf(
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_EATER,
            Tags.LOW_LIGHT
        )
    ),

    FreshDweller(
        id = 32,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/assassin_snail_1.jpg",
            "${BASE_URL}/static/fresh_dweller/assassin_snail_2.jpg"
        ),
        name = "Assassin snail",
        genus = "Anentome helena",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 3.0,
        minPh = 7.0,
        maxPh = 8.0,
        minGh = 8.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = "Sandy soil or gravel soil is suitable for comfortable keeping of these snails, as they like to burrow. They are dioecious, but it is impossible to distinguish males from females. The female lays eggs that look like transparent cubes with a yellow ball inside.",
        tags = listOf(
            Tags.PREDATOR,
            Tags.MONOGAMOUS,
            Tags.SNAIL,
            Tags.CARNIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.NEEDS_SMOOTH_SURFACES
        )
    ),

    FreshDweller(
        id = 33,
        imageUrls = null,
        name = "Black devil spike snail",
        genus = "Faunus ater",
        minTemperature = 25.0,
        maxTemperature = 28.0,
        liters = 10.0,
        minPh = 7.0,
        maxPh = 8.0,
        minGh = 5.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = null,
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 34,
        imageUrls = null,
        name = "Freshwater clam",
        genus = "Corbicula Javanicus",
        minTemperature = 22.0,
        maxTemperature = 27.0,
        liters = 20.0,
        minPh = 6.4,
        maxPh = 8.5,
        minGh = 10.0,
        maxGh = 24.0,
        minKh = null,
        maxKh = null,
        description = "For maintenance, soil is needed in which these mollusks can completely burrow. They filter water well, so in aquariums with them, fish get sick less often, the water does not algal bloom and does not become cloudy.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.BIVALVE,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.CLEANER,
            Tags.LIVEBEARER
        )
    ),

    FreshDweller(
        id = 39,
        imageUrls = null,
        name = "Physa",
        genus = "Physa",
        minTemperature = 20.0,
        maxTemperature = 28.0,
        liters = 1.0,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = 5.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = "These snails can only breathe atmospheric air, so they sometimes rise to the surface. These snails are detritivores, they clean the aquarium from organic debris.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_EATER
        )
    ),

    //Shrimps

    FreshDweller(
        id = 35,
        imageUrls = null,
        name = "Vampire shrimp",
        genus = "Atya gabonensis",
        minTemperature = 24.0,
        maxTemperature = 26.0,
        liters = 20.0,
        minPh = 6.0,
        maxPh = 7.0,
        minGh = 6.0,
        maxGh = 8.0,
        minKh = null,
        maxKh = null,
        description = "These shrimp feed in an unusual way - they catch food floating in the water. For feeding them, flakes for aquarium fish are suitable, which must be immersed in water to be sprayed by the current. In an aquarium with these shrimps, it is better not to use sand, as it is difficult for them to move on it. After birth, the larvae of these shrimp should be immersed in an aquarium with sea water and phytoplankton.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.BIG,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.FAST_CURRENT
        )
    ),

    FreshDweller(
        id = 36,
        imageUrls = null,
        name = "Pinoccio shrimp",
        genus = "Caridina gracilirostris",
        minTemperature = 24.0,
        maxTemperature = 30.0,
        liters = 2.0,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 8.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = "These shrimp are very fast, they can jump out of the water. They eat algae and organic debris well. Pregnant females need to be moved to an aquarium with seawater and phytoplankton for successful larval development. After giving birth, the female must be returned to the main aquarium.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 37,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/giant_freshwater_prawn.jpg"),
        name = "Giant freshwater prawn",
        genus = "Macrobrachium rosenbergii",
        minTemperature = 26.0,
        maxTemperature = 30.0,
        liters = 200.0,
        minPh = 7.0,
        maxPh = 8.0,
        minGh = 8.0,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = "Dominant males are blue. If there are several males, they will conflict. After birth, the larvae must be transferred to a saltwater aquarium.",
        tags = listOf(
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.PREDATOR,
            Tags.OMNIVOROUS,
            Tags.LARGE,
            Tags.LIVEBEARER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.TERRITORIAL
        )
    ),

    FreshDweller(
        id = 40,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/red_cherry_shrimp_1.jpg",
            "${BASE_URL}/static/fresh_dweller/red_cherry_shrimp_2.jpg",
            "${BASE_URL}/static/fresh_dweller/red_cherry_shrimp_3.jpg",
            "${BASE_URL}/static/fresh_dweller/red_cherry_shrimp_4.jpg"
        ),
        name = "Red Cherry Shrimp",
        genus = "Neocaridina davidi",
        minTemperature = 22.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = null,
        maxGh = null,
        minKh = 6.0,
        maxKh = 20.0,
        description = "These shrimp temporarily lose color when stressed. To preserve the bright colors of future generations, it is necessary to periodically add new bright individuals to the aquarium. They eat algae and organic debris well. The females of these shrimp are larger, brighter and slower than the males. They reproduce fairly quickly.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 41,
        imageUrls = null,
        name = "Yellow Shrimp",
        genus = "Neocaridina davidi",
        minTemperature = 22.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = null,
        maxGh = null,
        minKh = 6.0,
        maxKh = 20.0,
        description = "These shrimp temporarily lose color when stressed. To preserve the bright colors of future generations, it is necessary to periodically add new bright individuals to the aquarium. They eat algae and organic debris well. The females of these shrimp are larger, brighter and slower than the males. They reproduce fairly quickly.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 42,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/blue_dream_shrimp_1.jpg",
            "${BASE_URL}/static/fresh_dweller/blue_dream_shrimp_2.jpg"
        ),
        name = "Blue Dream Shrimp",
        genus = "Neocaridina davidi",
        minTemperature = 22.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = null,
        maxGh = null,
        minKh = 6.0,
        maxKh = 20.0,
        description = "These shrimp temporarily lose color when stressed. To preserve the bright colors of future generations, it is necessary to periodically add new bright individuals to the aquarium. They eat algae and organic debris well. The females of these shrimp are larger, brighter and slower than the males. They reproduce fairly quickly.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 43,
        imageUrls = null,
        name = "Rili Shrimp",
        genus = "Neocaridina davidi var. Rili",
        minTemperature = 20.0,
        maxTemperature = 26.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 4.0,
        maxGh = 14.0,
        minKh = null,
        maxKh = null,
        description = "These shrimp temporarily lose color when stressed. To preserve the bright colors of future generations, it is necessary to periodically add new bright individuals to the aquarium. They eat algae and organic debris well. The females of these shrimp are larger, brighter and slower than the males. They reproduce fairly quickly.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 44,
        imageUrls = null,
        name = "Bamboo Shrimp",
        genus = "Atyopsis moluccensis",
        minTemperature = 22.0,
        maxTemperature = 28.0,
        liters = 15.0,
        minPh = 6.0,
        maxPh = 7.5,
        minGh = 4.0,
        maxGh = 8.0,
        minKh = null,
        maxKh = null,
        description = "These shrimp feed in an unusual way - they catch food floating in the water. For feeding them, flakes for aquarium fish are suitable, which must be immersed in water to be sprayed by the current. After birth, the larvae of these shrimp should be immersed in an aquarium with sea water and phytoplankton.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.FAST_CURRENT,
            Tags.BROADLEAF_PLANT
        )
    ),

    FreshDweller(
        id = 45,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/amano_shrimp_1.jpg",
            "${BASE_URL}/static/fresh_dweller/amano_shrimp_2.jpg"
        ),
        name = "Amano Shrimp",
        genus = "Caridina multidentata",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 5.0,
        minPh = 7.0,
        maxPh = 7.5,
        minGh = 2.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "These shrimp are very good at cleaning the aquarium from algae. It can get out of the aquarium through a hose or wire, so it is better to cover the aquarium with a lid. They do not eat the eggs of other inhabitants of the aquarium. Males have a body covered with dots, while females have a body covered with lines. After birth, the larvae of these shrimp should be moved to a saltwater aquarium.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS,
            Tags.MEDIUM_CURRENT
        )
    ),

    FreshDweller(
        id = 46,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/crystal_red_shrimp_1.jpg",
            "${BASE_URL}/static/fresh_dweller/crystal_red_shrimp_2.jpg",
            "${BASE_URL}/static/fresh_dweller/crystal_red_shrimp_3.jpg"
        ),
        name = "Crystal Red Shrimp",
        genus = "Caridina cantonensis",
        minTemperature = 21.0,
        maxTemperature = 26.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 4.0,
        maxGh = 6.0,
        minKh = null,
        maxKh = null,
        description = "These shrimps do not tolerate changes in water parameters and water pollution very well. Poor nutrition of these shrimp leads to loss of color. If you want to cut a large plant in an aquarium with these shrimp, it is best to remove it from the aquarium before cutting it. Females are larger than males and have a more intense color. The stimulus for reproduction is a decrease in water temperature by several degrees below comfortable.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS,
            Tags.SLOW_CURRENT
        )
    ),

    FreshDweller(
        id = 47,
        imageUrls = null,
        name = "Crystal Black Shrimp",
        genus = "Caridina cantonensis",
        minTemperature = 21.0,
        maxTemperature = 26.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 4.0,
        maxGh = 6.0,
        minKh = null,
        maxKh = null,
        description = "These shrimps do not tolerate changes in water parameters and water pollution very well. Poor nutrition of these shrimp leads to loss of color. If you want to cut a large plant in an aquarium with these shrimp, it is best to remove it from the aquarium before cutting it. Females are larger than males and have a more intense color. The stimulus for reproduction is a decrease in water temperature by several degrees below comfortable.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS,
            Tags.SLOW_CURRENT
        )
    ),

    FreshDweller(
        id = 48,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/freshwater_prawn_1.jpg"
        ),
        name = "Freshwater Prawn",
        genus = "Macrobrachium",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 20.0,
        minPh = 7.0,
        maxPh = 8.0,
        minGh = 6.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = "If there are several males, they will conflict.",
        tags = listOf(
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.PREDATOR,
            Tags.OMNIVOROUS,
            Tags.BIG,
            Tags.LIVEBEARER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.TERRITORIAL,
            Tags.LOW_LIGHT,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 49,
        imageUrls = null,
        name = "Babaulti Shrimp",
        genus = "Caridina cf. babaulti",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 8.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "These shrimp can change color for camouflage purposes. Their color depends on the keeping conditions, feeding and mood. Females are larger than males.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 50,
        imageUrls = null,
        name = "Cardinal Sulawesi Shrimp",
        genus = "Caridina dennerli",
        minTemperature = 26.0,
        maxTemperature = 29.0,
        liters = null,
        minPh = 7.8,
        maxPh = 8.2,
        minGh = 6.0,
        maxGh = 8.0,
        minKh = null,
        maxKh = null,
        description = "These shrimp do not do well in ordinary water, for their keeping it is better to use osmotic water with the addition of a complex of special salts designed for them.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD
        )
    ),

    // Crayfish

    FreshDweller(
        id = 51,
        imageUrls = null,
        name = "Common yabby",
        genus = "Cherax destructor",
        minTemperature = 16.0,
        maxTemperature = 23.0,
        liters = 50.0,
        minPh = 7.0,
        maxPh = 7.5,
        minGh = 10.0,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = "It's a very intelligent crayfish. It moves the decorations of the aquarium and excavates the ground to create its own aquarium design. The design created by this crayfish should not be changed, otherwise, it will be dissatisfied. If you keep this crayfish in uncomfortable conditions, it will try to escape from the tank. Males have more powerful claws, and females have wider abdomens. To distinguish the male from the female, you need to turn the crayfish on the back and look at the base of the last pair of walking legs, the males have there growths similar to thorns. Adults do not attack the young, but the young can fight each other.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.BIG,
            Tags.NEEDS_SHELTER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_EATER,
            Tags.LIVEBEARER
        )
    ),

    FreshDweller(
        id = 52,
        imageUrls = null,
        name = "Red claw crayfish",
        genus = "Сherax quadricarinatus",
        minTemperature = 20.0,
        maxTemperature = 26.0,
        liters = 65.0,
        minPh = 6.5,
        maxPh = 8.5,
        minGh = 5.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "It's a very intelligent crayfish. It moves the decorations of the aquarium to create its own aquarium design. The design created by this crayfish should not be changed, otherwise, it will be dissatisfied. If you keep this crayfish in uncomfortable conditions, it will try to escape from the tank. The males have red growth on the claws. To stimulate reproduction, males and females can be separated for a week, after which their sexual activity will increase. The hatchlings of these crayfish must be separated, otherwise they will fight each other.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.BIG,
            Tags.NEEDS_SHELTER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_EATER,
            Tags.LIVEBEARER
        )
    ),

    FreshDweller(
        id = 53,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/cuban_crayfish_1.jpg"
        ),
        name = "Cuban crayfish",
        genus = "Procambarus cubensis",
        minTemperature = 24.0,
        maxTemperature = 26.0,
        liters = 25.0,
        minPh = 7.0,
        maxPh = 7.6,
        minGh = 8.0,
        maxGh = 12.0,
        minKh = null,
        maxKh = null,
        description = "These crayfish sometimes come out of the water, so in an aquarium with them you can install branches sticking out of the water. The males have the first set of abdominal legs turned into a special organ and leaning along the body. The young must be separated from the adults, otherwise they will be eaten.",
        tags = listOf(
            Tags.PREDATOR,
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.NEEDS_DRIFTWOOD
        )
    ),

    FreshDweller(
        id = 54,
        imageUrls = null,
        name = "Blue crayfish",
        genus = "Procambarus alleni",
        minTemperature = 20.0,
        maxTemperature = 25.0,
        liters = 50.0,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = 10.0,
        maxGh = 25.0,
        minKh = null,
        maxKh = null,
        description = "These crayfish have high intraspecific aggression, the males often fight. Males have an organ of reproduction on the abdomen. The young must be separated from the adults, otherwise, they will be eaten.",
        tags = listOf(
            Tags.PREDATOR,
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_EATER
        )
    ),

    FreshDweller(
        id = 55,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/red_swamp_crayfish_1.jpg",
            "${BASE_URL}/static/fresh_dweller/red_swamp_crayfish_2.jpg"
        ),
        name = "Red swamp crayfish",
        genus = "Procambarus clarkii",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 70.0,
        minPh = 7.0,
        maxPh = 7.5,
        minGh = 12.0,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = "The colour of these crayfish is very dependent on feeding: it varies from blue to brown. Carotenoids must be present in the crayfish diet to get a red colour. These crayfish sometimes come out of the water, so in an aquarium with them you can install branches sticking out of the water. These crayfish like to dig in the soil. The males have the first set of abdominal legs turned into a special organ and leaning along the body. The young must be separated from the adults, otherwise they will be eaten.",
        tags = listOf(
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_EATER,
            Tags.NEEDS_DRIFTWOOD
        )
    ),

    FreshDweller(
        id = 56,
        imageUrls = null,
        name = "Marbled crayfish",
        genus = "Procambarus virginalis",
        minTemperature = 18.0,
        maxTemperature = 28.0,
        liters = 40.0,
        minPh = 6.5,
        maxPh = 7.8,
        minGh = 8.0,
        maxGh = 12.0,
        minKh = null,
        maxKh = null,
        description = "These crayfish can crawl out of an aquarium through filter hoses. All individuals of these crayfish are females that can reproduce without fertilization (this process is called parthenogenesis). The young must be separated from the adults, otherwise, they will be eaten.",
        tags = listOf(
            Tags.PREDATOR,
            Tags.TERRITORIAL,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.PLANT_EATER
        )
    ),

    FreshDweller(
        id = 57,
        imageUrls = null,
        name = "Dwarf orange crayfish",
        genus = "Cambarellus patzcuarensis var. Orange",
        minTemperature = 18.0,
        maxTemperature = 25.0,
        liters = 25.0,
        minPh = 7.0,
        maxPh = 8.5,
        minGh = 10.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "These crayfish have very interesting behaviour. They have a noontime lifestyle. These crayfish love to build their home and dig the soil. When crayfish is hungry, it lifts its claws and runs along the wall of the aquarium. These pets like to hang upside down, caught on the stems of plants. They can crawl out of the aquarium through the hoses of the filter. The males have the first set of abdominal legs turned into a special organ and leaning along the body. Adults can attack young.",
        tags = listOf(
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_LOVER,
            Tags.LOW_LIGHT
        )
    ),

)

val freshDwellerListRu = listOf (
    FreshDweller(
        id = 1,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/pterophyllum_scalare_1.jpg",
            "${BASE_URL}/static/fresh_dweller/pterophyllum_scalare_2.jpg",
            "${BASE_URL}/static/fresh_dweller/pterophyllum_scalare_3.jpg",
        ),
        name = "Скалярия",
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
        name = "Неон",
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
        name = "Неон золотой",
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
        name = "Неон бриллиантовый",
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
        name = "Неон вуалевый",
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
        name = "Неон красный",
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
        name = "Неон чёрный",
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
        name = "Неон зелёный",
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
        name = "Неон саванный",
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
        name = "Ложный голубой неон",
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
        name = "Гуппи",
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
        name = "Гуппи эндлера",
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
        name = "Моллинезия",
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
        name = "Моллинезия латипина",
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
        name = "Моллинезия велифера",
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
        name = "Моллинезия вольная",
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
        name = "Ампулярия",
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
        description = "Ампулярии умеют дышать не только кислородом, растворённым в воде, но и атмосферным воздухом. У них обязательно должна быть возможность подышать атмосферным воздухом. Эти улитки раздельнополые, но отличить самку от самца очень тяжело. Свою икру они откладывают на суше, для инкубации ей необходим влажный воздух.",
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
        id = 38,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/apple_snail.jpg"),
        name = "Ампулярия",
        genus = "Ampullariidae",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = 10.0,
        minPh = 6.5,
        maxPh = 7.8,
        minGh = 8.0,
        maxGh = 18.0,
        minKh = null,
        maxKh = null,
        description = "Ампулярии умеют дышать не только кислородом, растворённым в воде, но и атмосферным воздухом. У них обязательно должна быть возможность подышать атмосферным воздухом. Эти улитки раздельнополые, но отличить самку от самца очень тяжело. Свою икру они откладывают на суше, для инкубации ей необходим влажный воздух.",
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
        name = "Ампулярия",
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
        description = "Ампулярии умеют дышать не только кислородом, растворённым в воде, но и атмосферным воздухом. У них обязательно должна быть возможность подышать атмосферным воздухом. Эти улитки раздельнополые, но отличить самку от самца очень тяжело. Свою икру они откладывают на суше, для инкубации ей необходим влажный воздух.",
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
        name = "Ампулярия",
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
        description = "Ампулярии умеют дышать не только кислородом, растворённым в воде, но и атмосферным воздухом. У них обязательно должна быть возможность подышать атмосферным воздухом. Эти улитки раздельнополые, но отличить самку от самца очень тяжело. Свою икру они откладывают на суше, для инкубации ей необходим влажный воздух.",
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
        name = "Ампулярия",
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
        description = "Ампулярии умеют дышать не только кислородом, растворённым в воде, но и атмосферным воздухом. У них обязательно должна быть возможность подышать атмосферным воздухом. Эти улитки раздельнополые, но отличить самку от самца очень тяжело. Свою икру они откладывают на суше, для инкубации ей необходим влажный воздух.",
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
        name = "Катушка",
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
        description = "Если катушки очень быстро размножаются - значит в аквариуме слишком много корма. Эти беспозвоночные могут дышать двумя способами – используя кислород, растворенный в воде, и атмосферный воздух. Эти улитки - детритофаги, они чистят аквариум от органического мусора.",
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
        name = "Мариза",
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
        description = "Маризы умеют дышать не только кислородом, растворённым в воде, но и атмосферным воздухом. У них обязательно должна быть возможность подышать атмосферным воздухом. Эти улитки раздельнополые, у самок тело тёмного цвета, а у самцов светлое. Для размножения этих улиток температура воды должна быть на несколько градусов теплее комфортного значения. Свою икру они откладывают на декорации аквариума.",
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
        name = "Мелания",
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
        description = "Эти улитки - детритофаги, они чистят аквариум от органического мусора. Они любят находиться в грунте аквариума. Если все улитки выползают из грунта - значит концентрация растворённого в воде кислорода слишком мала.",
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
        name = "Неритина",
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
        description = "Эти улитки хороши в поедании водрослей, при этом они не повреждают аквариумные растения. Они плохо переносят изменения параметров воды. Если эта улитка упала, то ей будет очень тяжело самостоятельно перевернуться. Иногда они останавливаются на одном месте и долго не двигаются, это нормально. Эти улитки раздельнополые, но отличить самку от самца невозможно. Они откладывают свою икру на декорации аквариума, но для инкубации икру необходимо перенести в аквариум с морской водой.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 26,
        imageUrls = null,
        name = "Неритина зебра",
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
        description = "Эти улитки хороши в поедании водрослей, при этом они не повреждают аквариумные растения. Они плохо переносят изменения параметров воды. Если эта улитка упала, то ей будет очень тяжело самостоятельно перевернуться. Иногда они останавливаются на одном месте и долго не двигаются, это нормально. Эти улитки раздельнополые, но отличить самку от самца невозможно. Они откладывают свою икру на декорации аквариума, но для инкубации икру необходимо перенести в аквариум с морской водой.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 27,
        imageUrls = null,
        name = "Неритина тигровая",
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
        description = "Эти улитки хороши в поедании водрослей, при этом они не повреждают аквариумные растения. Они плохо переносят изменения параметров воды. Если эта улитка упала, то ей будет очень тяжело самостоятельно перевернуться. Иногда они останавливаются на одном месте и долго не двигаются, это нормально. Эти улитки раздельнополые, но отличить самку от самца невозможно. Они откладывают свою икру на декорации аквариума, но для инкубации икру необходимо перенести в аквариум с морской водой.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 28,
        imageUrls = null,
        name = "Неритина оливковая",
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
        description = "Эти улитки хороши в поедании водрослей, при этом они не повреждают аквариумные растения. Они плохо переносят изменения параметров воды. Если эта улитка упала, то ей будет очень тяжело самостоятельно перевернуться. Иногда они останавливаются на одном месте и долго не двигаются, это нормально. Эти улитки раздельнополые, но отличить самку от самца невозможно. Они откладывают свою икру на декорации аквариума, но для инкубации икру необходимо перенести в аквариум с морской водой.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 29,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/ear_pond_snail_1.jpg",
            "${BASE_URL}/static/fresh_dweller/ear_pond_snail_2.jpg"
        ),
        name = "Улитка покемон",
        genus = "Radix",
        minTemperature = 22.0,
        maxTemperature = 28.0,
        liters = null,
        minPh = 6.0,
        maxPh = 8.0,
        minGh = 8.0,
        maxGh = 10.0,
        minKh = null,
        maxKh = null,
        description = "Эти улитки любят есть водоросли, не повреждая аквариумные растения. Если они быстро размножаются - значит в аквариуме слишком много корма.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_LOVER
        )
    ),

    FreshDweller(
        id = 30,
        imageUrls = null,
        name = "Неритина рогатая",
        genus = "Clithon",
        minTemperature = 24.0,
        maxTemperature = 26.0,
        liters = 3.0,
        minPh = 7.0,
        maxPh = null,
        minGh = 10.0,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = "Эти улитки хороши в поедании водрослей, при этом они не повреждают аквариумные растения. Они плохо переносят изменения параметров воды. Если эта улитка упала, то ей будет очень тяжело самостоятельно перевернуться. Иногда они останавливаются на одном месте и долго не двигаются, это нормально. Эти улитки раздельнополые, но отличить самку от самца невозможно. Они откладывают свою икру на декорации аквариума, но для инкубации икру необходимо перенести в аквариум с морской водой.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 31,
        imageUrls = null,
        name = "Тиломелания",
        genus = "Tylomelania insulaesacrae",
        minTemperature = 27.0,
        maxTemperature = 30.0,
        liters = 10.0,
        minPh = 7.5,
        maxPh = 8.5,
        minGh = 5.0,
        maxGh = 7.0,
        minKh = null,
        maxKh = null,
        description = "Для комфортного содержания этих улиток подойдёт песчаный грунт с крупными камнями в роли декораций. Едят эти улитки очень много, кормить их необходимо не менее 2 раз в день. Они раздельнополые, но отличить самцов от самок невозможно.",
        tags = listOf(
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_EATER,
            Tags.LOW_LIGHT
        )
    ),

    FreshDweller(
        id = 32,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/assassin_snail_1.jpg",
            "${BASE_URL}/static/fresh_dweller/assassin_snail_2.jpg"
        ),
        name = "Улитка хелена",
        genus = "Anentome helena",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 3.0,
        minPh = 7.0,
        maxPh = 8.0,
        minGh = 8.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = "Для комфортного содержания этих улиток подойдёт песчаный грунт или грунт из мелкой гальки, поскольку они любят закапываться. Они раздельнополые, но отличить самцов от самок невозможно. Самка откладывает икринки, похожие на прозрачные кубики с жёлтым шариком внутри.",
        tags = listOf(
            Tags.PREDATOR,
            Tags.MONOGAMOUS,
            Tags.SNAIL,
            Tags.CARNIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.NEEDS_SMOOTH_SURFACES
        )
    ),

    FreshDweller(
        id = 33,
        imageUrls = null,
        name = "Шип дъявола",
        genus = "Faunus ater",
        minTemperature = 25.0,
        maxTemperature = 28.0,
        liters = 10.0,
        minPh = 7.0,
        maxPh = 8.0,
        minGh = 5.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "Один из самых крупных аквариумных моллюсков. Эти брюхоногие очень активны, хорошо поедают водороосли, но не повреждают аквариумные растения. Они раздельнополые, но отличить самцов от самок невозможно. Самка откладывает икринки с белесой оболочкой, в которых несложно разглядеть маленьких улиток. Для инкубации икру необходимо перенести в аквариум с морской водой.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.HERBIVOROUS,
            Tags.MEDIUM,
            Tags.OVIPAROUS,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 34,
        imageUrls = null,
        name = "Корбикула яванская",
        genus = "Corbicula Javanicus",
        minTemperature = 22.0,
        maxTemperature = 27.0,
        liters = 20.0,
        minPh = 6.4,
        maxPh = 8.5,
        minGh = 10.0,
        maxGh = 24.0,
        minKh = null,
        maxKh = null,
        description = "Для содержания необходим грунт, в который эти моллюски смогут полностью зарыться. Они хорошо фильтруют воду, благодаря чему в аквариумах с ними рыбки болеют реже, вода не цветёт и не мутнеет.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.BIVALVE,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.CLEANER,
            Tags.LIVEBEARER
        )
    ),

    FreshDweller(
        id = 39,
        imageUrls = null,
        name = "Физа",
        genus = "Physa",
        minTemperature = 20.0,
        maxTemperature = 28.0,
        liters = 1.0,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = 5.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = "Эти улитки способны дышать только атмосферным воздухом, для чего иногда поднимаются к поверхности. Эти улитки - детритофаги, они чистят аквариум от органического мусора.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SNAIL,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.OVIPAROUS,
            Tags.CLEANER,
            Tags.PLANT_EATER
        )
    ),

    //Shrimps

    FreshDweller(
        id = 35,
        imageUrls = null,
        name = "Креветка габонский фильтратор",
        genus = "Atya gabonensis",
        minTemperature = 24.0,
        maxTemperature = 26.0,
        liters = 20.0,
        minPh = 6.0,
        maxPh = 7.0,
        minGh = 6.0,
        maxGh = 8.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки питаются необычным способом - они ловят пищу, плавающую в воде. Для их кормления подойдут хлопья для аквариумных рыбок, которые необходимо погрузить в воду, чтобы их распылило течением. В аквариуме с этими креветками лучше не использовать песок, поскольку им тяжело по нему передвигаться. После рождения личинки этих креветок должны быть погружены в аквариум с морской водой и фитопланктоном.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.BIG,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.FAST_CURRENT
        )
    ),

    FreshDweller(
        id = 36,
        imageUrls = null,
        name = "Креветка пиноккио",
        genus = "Caridina gracilirostris",
        minTemperature = 24.0,
        maxTemperature = 30.0,
        liters = 2.0,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 8.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки очень быстрые, они умеют выпрыгивать из воды. Они хорошо поедают водоросли и органические остатки. Беременных самок необходимо перемещать в аквариум с морской водой и фитопланктоном для успешного развития личинок. После родов самку необходимо вернуть в основной аквариум.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 37,
        imageUrls = listOf("${BASE_URL}/static/fresh_dweller/giant_freshwater_prawn.jpg"),
        name = "Креветка макробрахиум розенберга",
        genus = "Macrobrachium rosenbergii",
        minTemperature = 26.0,
        maxTemperature = 30.0,
        liters = 200.0,
        minPh = 7.0,
        maxPh = 8.0,
        minGh = 8.0,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = "Доминантные самцы имеют синюю окраску. Если самцов будет несколько, то они будут конфликтовать. После рождения личинок необходимо перенести в аквариум с морской водой.",
        tags = listOf(
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.PREDATOR,
            Tags.OMNIVOROUS,
            Tags.LARGE,
            Tags.LIVEBEARER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.TERRITORIAL
        )
    ),

    FreshDweller(
        id = 40,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/red_cherry_shrimp_1.jpg",
            "${BASE_URL}/static/fresh_dweller/red_cherry_shrimp_2.jpg",
            "${BASE_URL}/static/fresh_dweller/red_cherry_shrimp_3.jpg",
            "${BASE_URL}/static/fresh_dweller/red_cherry_shrimp_4.jpg"
        ),
        name = "Креветка вишня",
        genus = "Neocaridina davidi",
        minTemperature = 22.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = null,
        maxGh = null,
        minKh = 6.0,
        maxKh = 20.0,
        description = "Эти креветки временно теряют окраску во время стресса. Для поддержания яркой окраски будущих поколений необходимо периодически добавлять в аквариум новых ярких особей. Они хорошо поедают водоросли и органические остатки. Самки этих креветок больше, ярче и медленнее самцов. Размножаются они достаточно быстро.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 41,
        imageUrls = null,
        name = "Креветка жёлтая",
        genus = "Neocaridina davidi",
        minTemperature = 22.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = null,
        maxGh = null,
        minKh = 6.0,
        maxKh = 20.0,
        description = "Эти креветки временно теряют окраску во время стресса. Для поддержания яркой окраски будущих поколений необходимо периодически добавлять в аквариум новых ярких особей. Они хорошо поедают водоросли и органические остатки. Самки этих креветок больше, ярче и медленнее самцов. Размножаются они достаточно быстро.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 42,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/blue_dream_shrimp_1.jpg",
            "${BASE_URL}/static/fresh_dweller/blue_dream_shrimp_2.jpg",
        ),
        name = "Креветка голубая мечта",
        genus = "Neocaridina davidi",
        minTemperature = 22.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = null,
        maxGh = null,
        minKh = 6.0,
        maxKh = 20.0,
        description = "Эти креветки временно теряют окраску во время стресса. Для поддержания яркой окраски будущих поколений необходимо периодически добавлять в аквариум новых ярких особей. Они хорошо поедают водоросли и органические остатки. Самки этих креветок больше, ярче и медленнее самцов. Размножаются они достаточно быстро.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 43,
        imageUrls = null,
        name = "Креветка Рили",
        genus = "Neocaridina davidi var. Rili",
        minTemperature = 20.0,
        maxTemperature = 26.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 4.0,
        maxGh = 14.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки временно теряют окраску во время стресса. Для поддержания яркой окраски будущих поколений необходимо периодически добавлять в аквариум новых ярких особей. Они хорошо поедают водоросли и органические остатки. Самки этих креветок больше, ярче и медленнее самцов. Размножаются они достаточно быстро.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 44,
        imageUrls = null,
        name = "Креветка фильтратор",
        genus = "Atyopsis moluccensis",
        minTemperature = 22.0,
        maxTemperature = 28.0,
        liters = 15.0,
        minPh = 6.0,
        maxPh = 7.5,
        minGh = 4.0,
        maxGh = 8.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки питаются необычным способом - они ловят пищу, плавающую в воде. Для их кормления подойдут хлопья для аквариумных рыбок, которые необходимо погрузить в воду, чтобы их распылило течением. После рождения личинки этих креветок должны быть перемещены в аквариум с морской водой и фитопланктоном.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.FAST_CURRENT,
            Tags.BROADLEAF_PLANT
        )
    ),

    FreshDweller(
        id = 45,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/amano_shrimp_1.jpg",
            "${BASE_URL}/static/fresh_dweller/amano_shrimp_2.jpg"
        ),
        name = "Креветка Амано",
        genus = "Caridina multidentata",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 5.0,
        minPh = 7.0,
        maxPh = 7.5,
        minGh = 2.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки очень хорошо очищают аквариум от водорослей. Может вылезти из аквариума по шлангу или проводу, поэтому аквариум лучше накрыть крышкой. Не поедают икру других обитателей аквариума. У самцов тело покрыто точками, а у самок линиями. После рождения личинки этих креветок должны быть перемещены в аквариум с морской водой.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS,
            Tags.MEDIUM_CURRENT
        )
    ),

    FreshDweller(
        id = 46,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/crystal_red_shrimp_1.jpg",
            "${BASE_URL}/static/fresh_dweller/crystal_red_shrimp_2.jpg",
            "${BASE_URL}/static/fresh_dweller/crystal_red_shrimp_3.jpg"
        ),
        name = "Креветка красный кристалл",
        genus = "Caridina cantonensis",
        minTemperature = 21.0,
        maxTemperature = 26.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 4.0,
        maxGh = 6.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки очень плохо переносят изменения параметров воды и загрязнение воды. Плохое питание этих креветок приводит к потере окраса. Если вы хотите подстричь большое растение в аквариуме с этими креветками, то перед стрижкой лучше достать его из аквариума. Самки больше и ярче самцов. Стимулом к размножению служит понижение температуры воды на несколько градусов ниже комфортной.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS,
            Tags.SLOW_CURRENT
        )
    ),

    FreshDweller(
        id = 47,
        imageUrls = null,
        name = "Креветка чёрный кристалл",
        genus = "Caridina cantonensis",
        minTemperature = 21.0,
        maxTemperature = 26.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 4.0,
        maxGh = 6.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки очень плохо переносят изменения параметров воды и загрязнение воды. Плохое питание этих креветок приводит к потере окраса. Если вы хотите подстричь большое растение в аквариуме с этими креветками, то перед стрижкой лучше достать его из аквариума. Самки больше и ярче самцов. Стимулом к размножению служит понижение температуры воды на несколько градусов ниже комфортной.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.HERBIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS,
            Tags.SLOW_CURRENT
        )
    ),

    FreshDweller(
        id = 48,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/freshwater_prawn_1.jpg"
        ),
        name = "Креветка макробрахиум",
        genus = "Macrobrachium",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 20.0,
        minPh = 7.0,
        maxPh = 8.0,
        minGh = 6.0,
        maxGh = 15.0,
        minKh = null,
        maxKh = null,
        description = "Если самцов будет несколько, то они будут конфликтовать.",
        tags = listOf(
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.PREDATOR,
            Tags.OMNIVOROUS,
            Tags.BIG,
            Tags.LIVEBEARER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.TERRITORIAL,
            Tags.LOW_LIGHT,
            Tags.CLEANER
        )
    ),

    FreshDweller(
        id = 49,
        imageUrls = null,
        name = "Креветка бабаулти",
        genus = "Caridina cf. babaulti",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 8.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки умеют менять окраску в целях маскировки. Их окраска зависит от условий содержания, кормления и настроения. Самки крупнее самцов.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 49,
        imageUrls = null,
        name = "Креветка бабаулти",
        genus = "Caridina cf. babaulti",
        minTemperature = 23.0,
        maxTemperature = 25.0,
        liters = null,
        minPh = 6.5,
        maxPh = 7.5,
        minGh = 8.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки умеют менять окраску в целях маскировки. Их окраска зависит от условий содержания, кормления и настроения. Самки крупнее самцов.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD,
            Tags.PLANT_LOVER,
            Tags.NEEDS_MOSS
        )
    ),

    FreshDweller(
        id = 50,
        imageUrls = null,
        name = "Креветка кардинал",
        genus = "Caridina dennerli",
        minTemperature = 26.0,
        maxTemperature = 29.0,
        liters = null,
        minPh = 7.8,
        maxPh = 8.2,
        minGh = 6.0,
        maxGh = 8.0,
        minKh = null,
        maxKh = null,
        description = "Эти креветки чувствуют себя плохо в обычной воде, для их содержания лучше использовать осмотическую воду с добавлением комплекса специальных солей, разработанного для них.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.POLYGAMOUS,
            Tags.SHRIMP,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.LIVEBEARER,
            Tags.CLEANER,
            Tags.NEEDS_SHELTER,
            Tags.NEEDS_DRIFTWOOD
        )
    ),

    // Crayfish

    FreshDweller(
        id = 51,
        imageUrls = null,
        name = "Австралийский рак Ябби",
        genus = "Cherax destructor",
        minTemperature = 16.0,
        maxTemperature = 23.0,
        liters = 50.0,
        minPh = 7.0,
        maxPh = 7.5,
        minGh = 10.0,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = "Этот рак очень умён. Он двигает аквариумные декорации и роет грунт для того чтобы создать собственный дизайн своего аквариума. Созданный этим раком дизайн не стоит изменять, иначе он будет недоволен. Если содержать этого рака в некомфортных условиях, то он попытается сбежать из аквариума. У самцов более мощные клешни, а у самки более широкое брюшко. Чтобы отличить самца от самки, нужно перевернуть рака на спину и посмотреть на основание последней пары ходильных ног, у самцов там распологаются наросты, похожие на шипы. Взрослые особи не нападают на молодых, но молодые могут драться друг с другом.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.BIG,
            Tags.NEEDS_SHELTER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_EATER,
            Tags.LIVEBEARER
        )
    ),

    FreshDweller(
        id = 52,
        imageUrls = null,
        name = "Австралийский красноклешневый рак",
        genus = "Сherax quadricarinatus",
        minTemperature = 20.0,
        maxTemperature = 26.0,
        liters = 65.0,
        minPh = 6.5,
        maxPh = 8.5,
        minGh = 5.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "Этот рак очень умён. Он двигает аквариумные декорации для того чтобы создать собственный дизайн своего аквариума. Созданный этим раком дизайн не стоит изменять, иначе он будет недоволен. Если содержать этого рака в некомфортных условиях, то он попытается сбежать из аквариума. Самцы имеют красные выросты на клешнях. Для стимуляции размножения можно разделить самцов и самок на неделю, после этого их половая активность возрастёт. Мальков этих раков необходимо рассаживать, иначе они будут драться друг с другом.",
        tags = listOf(
            Tags.PEACEFUL,
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.BIG,
            Tags.NEEDS_SHELTER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_EATER,
            Tags.LIVEBEARER
        )
    ),

    FreshDweller(
        id = 53,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/cuban_crayfish_1.jpg"
        ),
        name = "Голубой кубинский рак",
        genus = "Procambarus cubensis",
        minTemperature = 24.0,
        maxTemperature = 26.0,
        liters = 25.0,
        minPh = 7.0,
        maxPh = 7.6,
        minGh = 8.0,
        maxGh = 12.0,
        minKh = null,
        maxKh = null,
        description = "Эти раки иногда выбираются на поверхность, поэтому в аквариуме с ними можно установить коряги, выглядывающие из воды. У самцов первая пара брюшных ножек превращена в особый орган и прижата к телу. Детёнышей необходимо отсадить от взрослых особей, иначе они будут съедены.",
        tags = listOf(
            Tags.PREDATOR,
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.NEEDS_DRIFTWOOD
        )
    ),

    FreshDweller(
        id = 54,
        imageUrls = null,
        name = "Флоридский синий рак",
        genus = "Procambarus alleni",
        minTemperature = 20.0,
        maxTemperature = 25.0,
        liters = 50.0,
        minPh = 6.5,
        maxPh = 8.0,
        minGh = 10.0,
        maxGh = 25.0,
        minKh = null,
        maxKh = null,
        description = "У этих раков сильно проявляется внутривидовая агрессия, самцы часто дерутся. У самцов на брюшке имеется орган размножения. Детёнышей необходимо отсадить от взрослых особей, иначе они будут съедены.",
        tags = listOf(
            Tags.PREDATOR,
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_EATER
        )
    ),

    FreshDweller(
        id = 55,
        imageUrls = listOf(
            "${BASE_URL}/static/fresh_dweller/red_swamp_crayfish_1.jpg",
            "${BASE_URL}/static/fresh_dweller/red_swamp_crayfish_2.jpg"
        ),
        name = "Красный калифорнийский рак",
        genus = "Procambarus clarkii",
        minTemperature = 23.0,
        maxTemperature = 27.0,
        liters = 70.0,
        minPh = 7.0,
        maxPh = 7.5,
        minGh = 12.0,
        maxGh = null,
        minKh = null,
        maxKh = null,
        description = "Окрас этого рака очень сильно зависит от кормления: он варьируется от сине-фиолетового до тёмно-коричневого. Для получения ярко-красной окраски в рационе рака должны присутствовать каротиноиды. Эти раки иногда выбираются на поверхность, поэтому в аквариуме с ними можно установить коряги, выглядывающие из воды. Эти раки любят копать грунт. У самцов первая пара брюшных ножек превращена в особый орган и прижата к телу. Детёнышей необходимо отсадить от взрослых особей, иначе они будут съедены.",
        tags = listOf(
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_EATER,
            Tags.NEEDS_DRIFTWOOD
        )
    ),

    FreshDweller(
        id = 56,
        imageUrls = null,
        name = "Мраморный рак",
        genus = "Procambarus virginalis",
        minTemperature = 18.0,
        maxTemperature = 28.0,
        liters = 40.0,
        minPh = 6.5,
        maxPh = 7.8,
        minGh = 8.0,
        maxGh = 12.0,
        minKh = null,
        maxKh = null,
        description = "Эти раки умеют выползать из аквариума по шлангам фильтра. Все особи этих раков - самки, которые способны размножаться без оплодотворения (этот процесс называется партеногенезом). Детёнышей необходимо отсадить от взрослых особей, иначе они будут съедены.",
        tags = listOf(
            Tags.PREDATOR,
            Tags.TERRITORIAL,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.MEDIUM,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.PLANT_EATER
        )
    ),

    FreshDweller(
        id = 57,
        imageUrls = null,
        name = "Мексиканский карликовый рак",
        genus = "Cambarellus patzcuarensis var. Orange",
        minTemperature = 18.0,
        maxTemperature = 25.0,
        liters = 25.0,
        minPh = 7.0,
        maxPh = 8.5,
        minGh = 10.0,
        maxGh = 20.0,
        minKh = null,
        maxKh = null,
        description = "Эти раки обладают очень интересным поведением. Они ведут дневной образ жизни. Эти раки любят обустраивать своё жилище и копать грунт. Когда рак голоден, он поднимает свои клешни и бегает вдоль стенки аквариума. Эти питомцы любят повисеть вниз головой, зацепившись за стебли растений. Они способны выползать из аквариума по шлангам фильтра. У самцов первая пара брюшных ножек превращена в особый орган и прижата к телу. Взрослые особи могут нападать на детёнышей.",
        tags = listOf(
            Tags.TERRITORIAL,
            Tags.POLYGAMOUS,
            Tags.CRAYFISH,
            Tags.OMNIVOROUS,
            Tags.SMALL,
            Tags.NEEDS_SHELTER,
            Tags.LIVEBEARER,
            Tags.SLOW_CURRENT,
            Tags.PLANT_LOVER,
            Tags.LOW_LIGHT
        )
    ),
)

