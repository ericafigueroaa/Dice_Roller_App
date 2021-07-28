package com.example.dice_roller_app

interface DiceContract {
    interface View{
        fun showNumber()
    }

    interface Presenter{
        fun getRandomNumber():Int
    }

    interface Model{
        fun randomNumber():Int
    }
}