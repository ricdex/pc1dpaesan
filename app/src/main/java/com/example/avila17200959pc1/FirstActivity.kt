package com.example.avila17200959pc1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }

    fun onClick(view: View) {
        var primerView: TextView = findViewById(R.id.primerValue);
        var segundoView: TextView = findViewById(R.id.segundoValue);

        val intent = Intent(this@FirstActivity,ResultadoActivity::class.java)
        intent.putExtra("suma",(primerView.text.toString().toInt() + segundoView.text.toString().toInt()).toString());
        intent.putExtra("resta",(primerView.text.toString().toInt() - segundoView.text.toString().toInt()).toString())
        intent.putExtra("multiplica",(primerView.text.toString().toInt() * segundoView.text.toString().toInt()).toString())
        intent.putExtra("divide",(primerView.text.toString().toInt() / segundoView.text.toString().toInt()).toString())

        startActivity(intent);

    }
}