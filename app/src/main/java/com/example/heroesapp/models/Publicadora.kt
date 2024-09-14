package com.example.heroesapp.models


data class Publicadora(val id : Int, val nombre : String, val img : String){

    companion object{
        val publicantes = mutableListOf<Publicadora>(
            Publicadora(1, "Marvel","https://kreafolk.com/cdn/shop/articles/marvel-logo-design-history-and-evolution-kreafolk_50f7a4b8-dc53-495d-89bc-84c168382b61.jpg?v=1717725011&width=2048"),
            Publicadora(2, "DC","https://static.wikia.nocookie.net/comicdc/images/1/1c/DC_Comics_logo.png/revision/latest?cb=20171019084246&path-prefix=es")
            )
        }
}