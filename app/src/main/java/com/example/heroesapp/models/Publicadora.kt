package com.example.heroesapp.models


data class Publicadora(val id : Int, val nombre : String, val img : String){

    companion object{
        val publicantes = mutableListOf<Publicadora>(
            Publicadora(1, "Marvel","https://kreafolk.com/cdn/shop/articles/marvel-logo-design-history-and-evolution-kreafolk_50f7a4b8-dc53-495d-89bc-84c168382b61.jpg?v=1717725011&width=2048"),
            Publicadora(2, "DC","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/e900793a-6430-4760-b513-f0341d60334d/db01rgo-cec6f645-d0d0-43ff-b969-b5b9573e833d.jpg/v1/fill/w_1024,h_727,q_75,strp/dc_comics_logo_wallpaper_by_m4w006_db01rgo-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NzI3IiwicGF0aCI6IlwvZlwvZTkwMDc5M2EtNjQzMC00NzYwLWI1MTMtZjAzNDFkNjAzMzRkXC9kYjAxcmdvLWNlYzZmNjQ1LWQwZDAtNDNmZi1iOTY5LWI1Yjk1NzNlODMzZC5qcGciLCJ3aWR0aCI6Ijw9MTAyNCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.e2wopBSxWEGuY8UE4g0lZPUN5tKqAWtj_Xft1GcJlpI")
            )
        }
}