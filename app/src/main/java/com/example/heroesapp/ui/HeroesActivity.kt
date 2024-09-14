package com.example.heroesapp.ui


import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroAdapter
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Publicadora

class HeroesActivity : AppCompatActivity() {

    lateinit var heroeRV: RecyclerView
    lateinit var btonSalir : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)

        val idPublicante = intent.getIntExtra("idPublicante",0)
        val publisher = Publicadora.publicantes.firstOrNull() {it.id == idPublicante}
        val heroes = Heroe.heroes.filter { it.publicadorId == idPublicante }
        val publisherName = intent.getStringExtra("publisherName") ?: "Publicadora"
        heroeRV = findViewById(R.id.publishersRecyclerview)


        heroeRV.adapter = HeroAdapter(heroes)
        heroeRV.layoutManager = GridLayoutManager(this, 2)

        btonSalir = findViewById(R.id.salirBtn)
        btonSalir.setOnClickListener{
            val intent = Intent(this@HeroesActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
            }

        }
}
