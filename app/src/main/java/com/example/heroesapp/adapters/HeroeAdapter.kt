package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.squareup.picasso.Picasso

class HeroAdapter(val heroes : List<Heroe>)
    : RecyclerView.Adapter<HeroViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroe_item, parent, false)
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.count()
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {

        val heroe = heroes[position]
        holder.heroeName.text = heroe.nombre
        Picasso.get().load(heroe.img).into(holder.heroeImage)

    }

}
class HeroViewHolder(view : View) : ViewHolder(view){
    val heroeImage : ImageView = view.findViewById(R.id.imgHer)
    val heroeName : TextView = view.findViewById(R.id.nomHer)


}