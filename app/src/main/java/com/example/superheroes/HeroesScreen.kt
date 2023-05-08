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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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

@Composable
fun SuperHeroItem(hero: Hero, modifier: Modifier = Modifier){
    Row(modifier = modifier
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
        ) {
        Column() {
            Text(
                text = stringResource(id = hero.superHeroName),
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = stringResource(id = hero.superHeroPower),
                style = MaterialTheme.typography.bodySmall
            )
        }
        Box{
            Image(
                modifier = modifier
                    .size(72.dp)
                    .padding(16.dp)
                    .clip(MaterialTheme.shapes.small),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = hero.superHeroImage),
                contentDescription = stringResource(id = hero.superHeroName)

            )
        }
    }
}
@Composable
fun SuperHeroItemCard(modifier : Modifier = Modifier){
    Card(modifier = modifier
        .clip(MaterialTheme.shapes.medium)
    ){

        SuperHeroItem(hero = Hero(superHeroName = R.string.hero1, superHeroPower = R.string.description1, superHeroImage = R.drawable.android_superhero1))

    }

}
@Preview(showBackground = true, apiLevel = 33)
@Composable
fun Preview(){
    SuperHeroItemCard()
}