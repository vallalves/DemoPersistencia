package com.example.demopersistencia

import android.content.Context

class SharedProeferecesUltils(context : Context) {

    val sharedPreferences = context
        .getSharedPreferences("MEU_APP",Context.MODE_PRIVATE)

    fun salvar(chave: String, valor:String){
       var editor =  sharedPreferences.edit()
        editor.putString(chave, valor)
        editor.apply()
    }

    fun buscar(chave: String) : String? {
        return  sharedPreferences.getString(chave,"")
    }

    fun limpar(){
        var editor =  sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    fun remover(chave: String){
        var editor =  sharedPreferences.edit()
        editor.remove(chave)
        editor.apply()
    }

}