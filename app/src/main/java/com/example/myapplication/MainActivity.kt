package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputMass = findViewById<EditText>(R.id.inputMass)
        val inputHeight = findViewById<EditText>(R.id.inputHeight)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val calculateButton = findViewById<View>(R.id.calculateButton)

        calculateButton.setOnClickListener {
            val mass = inputMass.text.toString().toDoubleOrNull() ?: 0.0
            val height = inputHeight.text.toString().toDoubleOrNull() ?: 0.0
            val g = 9.81

            val potentialEnergy = mass * g * height
            resultTextView.text = "Потенціальна енергія: $potentialEnergy Дж"
        }
    }
}