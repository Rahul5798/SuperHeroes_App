package com.example.superheroes

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroes.model.Hero
import com.example.superheroes.model.HeroesDataSource
import com.example.superheroes.ui.theme.SuperheroesTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun SuperHeroItemCard(hero: Hero, modifier : Modifier = Modifier){
    Card(modifier = modifier
        .clip(MaterialTheme.shapes.medium)
        .padding(8.dp,16.dp)
    ){
        Row(modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .heightIn(72.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Column(modifier = modifier.weight(1f)) {
                Text(
                    text = stringResource(id = hero.superHeroName),
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = stringResource(id = hero.superHeroPower),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Box(){
                Image(
                    modifier = modifier
                        .size(72.dp)
                        .padding(16.dp)
                        .clip(MaterialTheme.shapes.small)
                        .align(Alignment.CenterEnd),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = hero.superHeroImage),
                    contentDescription = stringResource(id = hero.superHeroName)
                )
            }
        }
    }
}
@Composable
fun SuperHeroItemList(heroes : List<Hero>, modifier: Modifier = Modifier){
    LazyColumn{
        items(heroes){
            hero -> SuperHeroItemCard(hero = hero)
        }
    }
}
@Composable
fun SuperHeroApp(){
    SuperheroesTheme() {
        SuperHeroItemList(heroes = HeroesDataSource.heroes)
    }
}
@Preview(showBackground = true, apiLevel = 33)
@Composable
fun Preview(){
    SuperHeroApp()
}