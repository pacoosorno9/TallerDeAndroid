package com.example.heroesapp.models

data class Heroe(
    val id : Int,
    val name: String,
    val price : Double,
    val description: String,
    val image : String,
    val rating : Double,
    val movieId : Int
){
    val computedPrice : String get() = "$$price"
/*
ES ALGO PARECIDO A LO DE RESTAURANTES SOLO QUE YO LO CAMBIE POR PELICULAS, ES DECIR QUE LOS HEROES
SE GUARDAN O ESTAN EN LA PELICULA. ALGO COMO COMIDA Y RESTAURANTES.
 */
    companion object {
        val heroes = mutableListOf<Heroe>(
            // Avengers
            Heroe(1, "Black Widow", 99.8, "**Black Widow** es una ex espía rusa experta en combate que se une a los Avengers para redimirse.", "https://static.wikia.nocookie.net/disney/images/7/7a/Avengers_infinity_war_black_widow.png/revision/latest?cb=20190427185954&path-prefix=es", 4.3, 1),
            Heroe(2, "Doctor Strange", 95.59, "**Doctor Strange** es un ex cirujano convertido en el Hechicero Supremo, maestro de las artes místicas y la magia.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/d/o/doctor-strange-spiderman-no-way-home-por-hot-toys-18.png", 4.9, 1),

            // Batman VS Superman
            Heroe(3, "Bat-Man", 79.8, "Batman es un vigilante de Gotham, un detective y experto en combate sin poderes que lucha usando tecnología.","https://cdn.multiversus.com/roster/batman/batman-lg.webp", 4.6, 2),
            Heroe(4, "Super-Man", 49.8, "Superman es un superhéroe extraterrestre de Krypton con fuerza, vuelo y poderes sobrehumanos, defensor de la justicia.", "https://static.wikia.nocookie.net/allficcion/images/4/40/Kal_Kent.png/revision/latest?cb=20160518215506&path-prefix=es", 4.7, 2),

            // Guardianes De La Galaxia
            Heroe(5, "Rocket Racoon", 119.8, "Rocket Raccoon es un genio en tácticas y armas, un mapache modificado que es miembro de los Guardianes de la Galaxia.", "https://static.wikia.nocookie.net/marvelvscapcomespaol/images/8/85/RocketRaccoon-MvCI.png/revision/latest?cb=20170902222429&path-prefix=es", 4.4, 3),
            Heroe(6, "Groot", 99.8, "Groot es un ser arbóreo con habilidades regenerativas, compañero de Rocket, que solo dice \"I am Groot\".", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/g/r/groot-deluxe-im-groot-marvel-hot-toys-19.png", 4.2, 3),

            // La Liga De La Jusricia
            Heroe(7, "Mujer Maravilla", 159.8, "Wonder Woman es una guerrera amazona con fuerza sobrehumana, habilidades de combate y armas míticas como el Lazo de la Verdad.", "https://cdn.multiversus.com/roster/wonder-woman/wonder-woman-lg.webp", 4.5, 4),
            Heroe(8, "Flash", 199.8, "Flash es el hombre más rápido del mundo, capaz de moverse a velocidades increíbles y manipular el tiempo.", "https://upload.wikimedia.org/wikipedia/en/b/b7/Flash_%28Barry_Allen%29.png", 4.6, 4),

            // Civil war
            Heroe(9, "Capitan-America", 129.8, "Capitán América es un supersoldado patriota con fuerza mejorada y un escudo indestructible, líder de los Avengers.", "https://static.wikia.nocookie.net/marvelvscapcomespaol/images/c/ca/Captain-america-MvCI.png/revision/latest?cb=20170826202042&path-prefix=es", 4.7, 5),
            Heroe(10, "Tony Stark", 119.8, "Tony Stark (Iron Man) es un genio multimillonario que usa un traje de alta tecnología para luchar como Iron Man.", "https://i.pinimg.com/originals/f8/47/55/f847557cf93947d9027f189d9d243334.png", 4.5, 5),
        )
    }
}