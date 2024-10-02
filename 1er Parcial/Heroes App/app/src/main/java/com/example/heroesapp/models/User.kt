package com.example.heroesapp.models

data class User(val name:String,val email:String,val password:String){
    val computedName :String get() ="Hola, $name"
    companion object{
        val users = listOf(
            User("Paco", "pacoosorno9@gmail.com", "IIPPF.123"),
            User("Juan", "juanmtz@gmail.com", "Pejelagarto15"),
            User("Prueba", "prueba@gmail.com", "1234")
        )
    }
}
