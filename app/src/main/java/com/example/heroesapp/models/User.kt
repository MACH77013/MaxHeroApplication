package com.example.heroesapp.models

data class User(val email : String, val password : String, val name : String){

    companion object{
        val staticUsers = listOf(
            User(email="pancho@gmail.com",password="qwerty","Pancho"),
            User(email="yusepe@gmail.com",password="qwerty","Yusepe"),
            User(email="carmelo@gmail.com",password="qwerty","Carmelo"),
            User(email="victor@gmail.com",password="qwerty","Victor")
        )
            }
}