

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
import com.example.heroesapp.models.Publicadora
import com.squareup.picasso.Picasso

class PublisherAdapter(val publicantes : List<Publicadora>, val onClick:(Publicadora)->Unit)
    : RecyclerView.Adapter<PublisherViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.publicadora_item, parent, false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publicantes.count()
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publicante = publicantes[position]
        holder.nombrePublicante.text = publicante.nombre
        Picasso.get().load(publicante.img).into(holder.publicanteImage)

        holder.publicanteImage.setOnClickListener{
            onClick(publicante)
        }

    }

}
class PublisherViewHolder(view : View) : ViewHolder(view){
    val publicanteImage : ImageView = view.findViewById(R.id.imgPub)
    val nombrePublicante : TextView = view.findViewById(R.id.nomPub)



}
