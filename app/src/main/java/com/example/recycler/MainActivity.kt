package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.adapter.DestinoRecenteAdapter
import com.example.recycler.model.Destinosrecentes

class MainActivity : AppCompatActivity() {

    lateinit var rvDestinosrecentes: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDestinosrecentes = findViewById(R.id.rv_destinos_recentes)

        rvDestinosrecentes.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val adapterDestinosRecentes = DestinoRecenteAdapter(setListaDestinosRecentes(), this)

        rvDestinosrecentes.adapter = adapterDestinosRecentes
    }

    private  fun setListaDestinosRecentes() : List<Destinosrecentes> {
        val lista = listOf(
            Destinosrecentes("Porto de Galinhas", "Pernambuco", "R$1.500,00"),
            Destinosrecentes("Cristo Redentor", "Rio de Janeiro", "R$600,00"),
            Destinosrecentes("Praia das Joaquinas", "Santa Catarina", "R$800,00"),
            Destinosrecentes("Gramado", "Rio Grande do Sul", "R$2.500,00"),
            Destinosrecentes("Campos do jordão", "São Paulo", "R$500,00"),
            Destinosrecentes("Porto Seguro", "Bahia", "R$500,00"))

        return lista

    }
}