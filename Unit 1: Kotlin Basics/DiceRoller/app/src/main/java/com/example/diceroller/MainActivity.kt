package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /**
     * Dice class imitates a real-life dice with specified amount of sides
     * @param numSides: the number of sides of the dice
     */
    class Dice(private val numSides: Int) {

        /**
         * Simulates the rolling of a n-sided dice
         * @return a random integer from 1 to numSides
         */
        fun roll(): Int {
            return (1..numSides).random()
        }

    }

    /**
     * This class is used to track achievements
     */
    class Achievement(val message: String) {

        //TODO: had to use a class variable to update timesClicked in setOnClickListener{}
        var timesClicked = 0;

    }

    /**
     * This function uses the Dice class' roll() function
     * This also updates all necessary Views
     */
    private fun rollDice() {
        // Create new dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // find the imageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView);

        // resource id changes based on number rolled
        val drawableResource = when (diceRoll){
            1 -> R.drawable.dice_1;
            2 -> R.drawable.dice_2;
            3 -> R.drawable.dice_3;
            4 -> R.drawable.dice_4;
            5 -> R.drawable.dice_5;
            else -> R.drawable.dice_6;
        }
        // update ImageView with correct image
        diceImage.setImageResource(drawableResource);
        // Update content description to image number
        diceImage.contentDescription = diceRoll.toString();

    }


    /**
     * The main function
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // must be called after overriding
        setContentView(R.layout.activity_main) // starts the layout

        val clickedTenTimes = Achievement("Spammer!!");

        // Do a dice roll when the app starts
        rollDice();

        // display message when button is clicked
        val rollButton: Button = findViewById(R.id.button) // rollButton data type is specified as a Button
        rollButton.setOnClickListener {

            // Roll the dice
            rollDice()

            // create an achievement with Toast: if clicked 10 times, then show achievement
            clickedTenTimes.timesClicked += 1;
            if (clickedTenTimes.timesClicked == 10) {
                val toast = Toast.makeText(this, clickedTenTimes.message, Toast.LENGTH_LONG).show();
            }

        }

    }
}