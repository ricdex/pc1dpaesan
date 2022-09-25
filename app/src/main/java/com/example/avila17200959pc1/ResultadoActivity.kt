package com.example.avila17200959pc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val suma=intent.getStringExtra("suma");
        val resta=intent.getStringExtra("resta");
        val multiplica=intent.getStringExtra("multiplica");
        val divide=intent.getStringExtra("divide");

        findViewById<TextView?>(R.id.sumaValue).text = suma;
        findViewById<TextView?>(R.id.restaValue).text = resta;
        findViewById<TextView?>(R.id.multiplicaValue).text = multiplica;
        findViewById<TextView?>(R.id.divideValue).text = divide;
    }
}