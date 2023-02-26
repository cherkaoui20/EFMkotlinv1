package com.example.regionalkotv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var textView2: TextView
    lateinit var textView3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.edit1)
        val resultEmpty = findViewById<TextView>(R.id.textView2)
        val resultSigle = findViewById<TextView>(R.id.textView3)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val input = editText.text.toString()
            if (input.isBlank() || input.isEmpty()) {
                textView2.text = ""
                textView3.text = ""
            } else {

            }
        }
    }



    }

}
