package com.example.demoapplication

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class WelcomeActivity : AppCompatActivity() {

    lateinit var oneButton: Button
    lateinit var twoButton: Button
    lateinit var threeButton: Button
    lateinit var submitButton: Button
    lateinit var closeAlertBtn: Button

    lateinit var display: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        oneButton = findViewById(R.id.btn_one)
        twoButton = findViewById(R.id.btn_two)
        threeButton = findViewById(R.id.btn_three)
        submitButton = findViewById(R.id.btn_submit)
        display = findViewById(R.id.tv_infoDisplay)

        oneButton.setOnClickListener {

            display.text = "Welcome To Android"
            submitButton.text = "Learn"

        }
        twoButton.setOnClickListener {

            display.text = "This is simple"
            submitButton.text = "Really"

        }
        threeButton.setOnClickListener {

            display.text = "We are done"
            submitButton.text = "Finish"

        }

        submitButton.setOnClickListener {

            var intent = Intent(this, DisplayMessage::class.java)



            when (submitButton.text) {

                "Learn" -> {
                    intent.putExtra("MSG", "Lets start with Android")
                    startActivity(intent)
                }

                "Really" -> {
                    intent.putExtra("MSG", "I am learning")
                    startActivity(intent)
                }

                "Finish" -> {
                    var alert = AlertDialog.Builder(this)
//                    alert.setMessage("You Are Done")
//                    alert.setPositiveButton("OK", { dialogInterface: DialogInterface, i: Int ->
//                        finish()
//                    })
                    var v = layoutInflater.inflate(R.layout.alert_layout, null)
                    alert.setView(v)
                    closeAlertBtn = v.findViewById<Button>(R.id.btn_closeAlert)
                    alert.setCancelable(false)
                    closeAlertBtn.setOnClickListener {
                        finish()
                    }

                    alert.show()
                }
            }


        }


    }
}
