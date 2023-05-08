package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(
            superHeroName = R.string.hero1,
            superHeroPower = R.string.description1,
            superHeroImage = R.drawable.android_superhero1
        ),
        Hero(
            superHeroName = R.string.hero2,
            superHeroPower = R.string.description2,
            superHeroImage = R.drawable.android_superhero2
        ),
        Hero(
            superHeroName = R.string.hero3,
            superHeroPower = R.string.description3,
            superHeroImage = R.drawable.android_superhero3
        ),
        Hero(
            superHeroName = R.string.hero4,
            superHeroPower = R.string.description4,
            superHeroImage = R.drawable.android_superhero4
        ),
        Hero(
            superHeroName = R.string.hero5,
            superHeroPower = R.string.description5,
            superHeroImage = R.drawable.android_superhero5
        ),
        Hero(
            superHeroName = R.string.hero6,
            superHeroPower = R.string.description6,
            superHeroImage = R.drawable.android_superhero6
        )
    )
}