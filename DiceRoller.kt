package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
        val rollButton_2: Button = findViewById(R.id.button3)
        rollButton_2.setOnClickListener {
            rollDice_2()
        }
    }

    private fun rollDice() {
        val myFirstDice = Dice(6)
        val diceRoll = myFirstDice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice_2() {
        val mySecondDice = Dice(20)
        val diceRoll_2 = mySecondDice.roll()
        val resultTextView_2: TextView = findViewById(R.id.textView2)
        resultTextView_2.text = diceRoll_2.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }


}