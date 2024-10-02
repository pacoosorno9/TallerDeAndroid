package com.example.heroesapp.models

data class Category(val id : Int, val name:String, val image :String){
    companion object{
        val categories = mutableListOf<Category>(
            Category(1,"Insectos","https://i.pinimg.com/originals/5e/8b/6e/5e8b6e617ef4728059bcdc42386ca378.jpg"),
            Category(2,"De agua","https://png.pngtree.com/png-clipart/20230810/original/pngtree-superhero-squad-is-carrying-water-gun-for-fun-picture-image_7841493.png"),
            Category(3,"Mujeres","https://png.pngtree.com/png-clipart/20230823/original/pngtree-superheroes-women-characters-superhero-girl-picture-image_8285127.png"),
            Category(4,"Fuertes","https://vignette2.wikia.nocookie.net/fictionalcrossover/images/d/d5/Hulk.png/revision/latest?cb=20160117225945"),
            Category(5,"Famosillos","https://img-s-msn-com.akamaized.net/tenant/amp/entityid/BB1pUBwn.img?w=768&h=432&m=4&q=100"),
        )
    }
}
