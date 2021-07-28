package com.example.dice_roller_app.presenter

import com.example.dice_roller_app.DiceContract
import com.example.dice_roller_app.view.MainActivity

class DicePresenter(private val DiceView:DiceContract.View, private val DiceModel:DiceContract.Model):DiceContract.Presenter {

    override fun getRandomNumber() :Int {
        return DiceModel.randomNumber()
    }
}