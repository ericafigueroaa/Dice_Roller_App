package com.example.dice_roller_app.model

import com.example.dice_roller_app.DiceContract
import com.example.dice_roller_app.R

data class DiceModel(var numDice: Int=0, override var imageResource: Int=0):DiceContract.Model {
    companion object{
        const val DICE_NUMBER_MAX=6
    }
    override fun setRandomNumber() {
        numDice=(1..DICE_NUMBER_MAX).random()
        setImageDice()
    }

    private fun setImageDice(){
        imageResource= when(numDice)
        {
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            6-> R.drawable.dice6
            else -> R.drawable.dice1
        }
    }
}