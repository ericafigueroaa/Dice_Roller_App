package com.example.dice_roller_app

interface DiceContract {
    interface View{
        fun showNumber(num:Int)
    }

    interface Presenter{
        fun getRandomNumber()
    }

    interface Model{
        fun setRandomNumber()
        var imageResource: Int
    }
}