package com.example.dice_roller_app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.dice_roller_app.DiceContract
import com.example.dice_roller_app.R
import com.example.dice_roller_app.databinding.ActivityMainBinding
import com.example.dice_roller_app.model.DiceModel
import com.example.dice_roller_app.presenter.DicePresenter

class MainActivity : AppCompatActivity(), DiceContract.View{

    private lateinit var binding: ActivityMainBinding
    private lateinit var dicePresenter: DicePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners()
        dicePresenter=DicePresenter(this,DiceModel())
    }

    private fun setOnClickListeners(){
        binding.buttonRoll.setOnClickListener {
            dicePresenter.getRandomNumber()
        }
    }

    override fun showNumber(imageResource: Int) {
        binding.imageViewDice.setImageResource(imageResource)
    }
}