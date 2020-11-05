package br.com.gledson.navegacao_telas

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun proximaTela(view: View) {
        val valorUm = valor1.text.toString()
        val valorDois = valor2.text.toString()

        val i = Intent(this, Main2Activity::class.java)
        i.putExtra("valorUm", valorUm)

        val sharedPref = getSharedPreferences("NAVEGACAO", Context.MODE_PRIVATE).edit()
        sharedPref.putString("valorDois", valorDois)
        sharedPref.commit()

        startActivity(i)
    }
}
