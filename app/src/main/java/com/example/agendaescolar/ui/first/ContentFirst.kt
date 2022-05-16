package com.example.agendaescolar.ui.first

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.agendaescolar.MainActivity
import android.content.Intent
import com.example.agendaescolar.R

class ContentFirst : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_first)
    }

    override fun onResume() {
        super.onResume()

        findViewById<Button>(R.id.btnHome).setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}