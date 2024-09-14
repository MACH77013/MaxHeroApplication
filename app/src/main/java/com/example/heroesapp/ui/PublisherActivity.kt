package com.example.heroesapp.ui


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Publicadora

class PublisherActivity : AppCompatActivity() {
    lateinit var username : TextView
    lateinit var btnSalir : ImageView



    lateinit var publisherRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)


        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)


        publisherRecyclerView = findViewById(R.id.publicanteRV)

        publisherRecyclerView.adapter = PublisherAdapter(Publicadora.publicantes){
                publicante ->
            val intent = Intent(this@PublisherActivity, HeroesActivity::class.java).apply {
                putExtra("idPublicante", publicante.id)
                putExtra("publisherName", publicante.nombre)
            }
            startActivity(intent)
        }

        publisherRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        username = findViewById(R.id.usernameTV)
        btnSalir = findViewById(R.id.salirBtn)
        btnSalir.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()
            val intent = Intent(this@PublisherActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
            }

        }

    }
