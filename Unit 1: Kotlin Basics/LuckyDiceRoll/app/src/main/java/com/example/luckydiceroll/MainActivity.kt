package com.example.luckydiceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Dice object simulates a real-life dice that you can roll
 * @param numSides: the number of sides on the dice
 */
class Dice (val numSides: Int){

    /**
     * Rolls the dice and returns a random value from 1-numSides
     * @return a random integer from 1 to numSides
     */
    fun roll(): Int {
        return (1.. numSides).random();
    }

}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}