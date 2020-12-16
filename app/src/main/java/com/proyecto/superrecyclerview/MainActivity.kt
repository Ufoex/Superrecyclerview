package com.proyecto.superrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.proyecto.superrecyclerview.modelo.Pais
import com.proyecto.superrecyclerview.adapters.paisAdapter

class MainActivity : AppCompatActivity() {
    var miRecycler: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.mirecycler)
        val listaPaises = ArrayList<Pais>()

        listaPaises.add(
            Pais(
                "Mexico",
                "https://http2.mlstatic.com/D_NQ_NP_994711-MLM20602404757_022016-O.webp"
            )
        )
        listaPaises.add(
            Pais(
                "Japon ",
                "https://ikigaimatsuri.com/wp-content/uploads/2020/05/la-bandera-de-japon-2.jpg"
            )
        )
        listaPaises.add(
            Pais(
                "Irlanda",
                "https://i.pinimg.com/originals/be/f3/a6/bef3a6ea6b310be1f39ebf33de86d357.jpg"
            )
        )

        miRecycler!!.layoutManager = GridLayoutManager(this, 1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter = paisAdapter(listaPaises, this)


    }

}