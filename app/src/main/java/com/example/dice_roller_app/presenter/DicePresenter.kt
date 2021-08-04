package com.example.dice_roller_app.presenter

import com.example.dice_roller_app.DiceContract

class DicePresenter(
    private val diceView: DiceContract.View,
    private val diceModel: DiceContract.Model
) : DiceContract.Presenter {

    override fun getRandomNumber() {
        diceModel.setRandomNumber()
        diceView.showNumber(diceModel.imageResource)
    }
}