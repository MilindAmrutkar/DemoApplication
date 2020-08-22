package com.example.demoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessage : AppCompatActivity() {

    lateinit var displayMessage : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        displayMessage = findViewById(R.id.tv_disMsg)

        var msgg = intent.getStringExtra("MSG")

        displayMessage.text = msgg


    }
}
