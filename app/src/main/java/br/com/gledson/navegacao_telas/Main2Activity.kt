package br.com.gledson.navegacao_telas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val valorUm = intent.getStringExtra("valorUm")
        val valorDois = getSharedPreferences("NAVEGACAO", Context.MODE_PRIVATE).getString("valorDois", "")

        valor1.text = valorUm
        valor2.text = valorDois
    }
}
