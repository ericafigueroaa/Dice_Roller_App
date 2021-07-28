package com.example.dice_roller_app.model

import com.example.dice_roller_app.DiceContract

class DiceModel(private val num: Int):DiceContract.Model {
    override fun randomNumber():Int {
        return(1..num).random()
    }
}