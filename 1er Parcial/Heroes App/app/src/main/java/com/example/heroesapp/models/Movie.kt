package com.example.heroesapp.models

data class Movie(val id: Int,val name:String,val image:String){
    companion object{
        val movie = mutableListOf<Movie>(
            Movie(1,"Avengers","https://seeklogo.com/images/A/avengers-logo-5B0A68AFB3-seeklogo.com.png"),
            Movie(2,"BatMan VS SuperMan","https://i.pinimg.com/originals/84/2c/2c/842c2c2b50fc4baaa85c32b7361ee53c.png"),
            Movie(3,"Guardianes De La Galaxia","https://i.pinimg.com/originals/fd/0f/7b/fd0f7b7443f0fa6d8ebf346aec421805.png"),
            Movie(4,"La Liga De La Justicia","https://1000marcas.net/wp-content/uploads/2021/04/Justice-League-Logo-2017.png"),
            Movie(5,"Civil War","https://upload.wikimedia.org/wikipedia/commons/d/d2/Captain_America_Civil_War_logo.png"),
        )
    }
}