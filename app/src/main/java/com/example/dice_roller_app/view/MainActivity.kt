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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners()
    }

    private fun setOnClickListeners(){
        binding.buttonRoll.setOnClickListener {
            showNumber()
        }
    }

    override fun showNumber() {
        val dicePresenter=DicePresenter(this,DiceModel( 6))
        val dR= when(dicePresenter.getRandomNumber())
        {
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            6-> R.drawable.dice6
            else -> R.drawable.dice1
        }
        binding.imageViewDice.setImageResource(dR)
    }
}