package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    lateinit var dice :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbot : Button = findViewById(R.id.roll_button)
        rollbot.setOnClickListener { rolldice() }
        dice = findViewById(R.id.diceview)
    }

    private fun rolldice() {

            val ran = Random().nextInt(6)+1
           val drawable =  when(ran){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        dice.setImageResource(drawable)

    }

}