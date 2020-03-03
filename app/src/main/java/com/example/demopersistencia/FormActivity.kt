package com.example.demopersistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        var sharedproefereces = SharedProeferecesUltils(this)

        btSalvar.setOnClickListener {
            sharedproefereces.salvar("nome", etNome.text.toString())
            etNome.setText("")
        }

        btExcluir.setOnClickListener{
            sharedproefereces.remover("nome")
            etNome.setText("")
        }

        btReculperar.setOnClickListener {
            etNome.setText(sharedproefereces.buscar("nome"))
        }

    }
}
