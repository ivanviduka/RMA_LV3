package com.example.birdcounter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpUi()
    }


    private fun setUpUi() {
        btnBlackBird.setOnClickListener{v -> onClick(v.id)}
        btnBrownBird.setOnClickListener{v -> onClick(v.id)}
        btnRedBird.setOnClickListener{v -> onClick(v.id)}
        btnYellowBird.setOnClickListener{v -> onClick(v.id)}
        btnReset.setOnClickListener{v -> onClick(v.id)}
    }



    private fun onClick(buttonID: Int) {

        var counter : Int

        val preferenceManager = PreferenceManager()


        when(buttonID){

            R.id.btnBlackBird -> {

                counter = tvCurrentBirdCount.text.toString().toInt() + 1

                tvCurrentBirdCount.text = counter.toString()

                tvCurrentBirdCount.setBackgroundColor(Color.BLACK)
                tvCurrentBirdCount.setTextColor(Color.WHITE)


                preferenceManager.saveCount(counter)
                preferenceManager.saveColor(Color.BLACK)
                preferenceManager.saveTextColor(Color.WHITE)

            }

            R.id.btnBrownBird -> {

                counter = tvCurrentBirdCount.text.toString().toInt() + 1

                tvCurrentBirdCount.text = counter.toString()

                tvCurrentBirdCount.setBackgroundColor(Color.parseColor("#684439"))
                tvCurrentBirdCount.setTextColor(Color.BLACK)


                preferenceManager.saveCount(counter)
                preferenceManager.saveColor(Color.parseColor("#684439"))
                preferenceManager.saveTextColor(Color.BLACK)


            }

            R.id.btnYellowBird -> {

                counter = tvCurrentBirdCount.text.toString().toInt() + 1

                tvCurrentBirdCount.text = counter.toString()

                tvCurrentBirdCount.setBackgroundColor(Color.YELLOW)
                tvCurrentBirdCount.setTextColor(Color.BLACK)


                preferenceManager.saveCount(counter)
                preferenceManager.saveColor(Color.YELLOW)
                preferenceManager.saveTextColor(Color.BLACK)


            }

            R.id.btnRedBird -> {

                counter = tvCurrentBirdCount.text.toString().toInt() + 1

                tvCurrentBirdCount.text = counter.toString()

                tvCurrentBirdCount.setBackgroundColor(Color.RED)
                tvCurrentBirdCount.setTextColor(Color.BLACK)


                preferenceManager.saveCount(counter)
                preferenceManager.saveColor(Color.RED)
                preferenceManager.saveTextColor(Color.BLACK)


            }

            R.id.btnReset -> {

                counter = 0

                tvCurrentBirdCount.text = counter.toString()

                tvCurrentBirdCount.setBackgroundColor(Color.WHITE)
                tvCurrentBirdCount.setTextColor(Color.BLACK)


                preferenceManager.saveCount(counter)
                preferenceManager.saveColor(Color.WHITE)
                preferenceManager.saveTextColor(Color.BLACK)


            }


        }

    }

    override fun onResume() {
        super.onResume()
        loadCounter()
        loadColor()
        loadTextColor()
    }

    private fun loadTextColor() {
        val currentTextColor = PreferenceManager().retrieveTextColor()
        
        tvCurrentBirdCount.setTextColor(currentTextColor)
    }

    private fun loadColor() {
        val currentColor = PreferenceManager().retrieveColor()

        tvCurrentBirdCount.setBackgroundColor(currentColor)
    }

    private fun loadCounter() {
        val currentCounter = PreferenceManager().retrieveCount()

        tvCurrentBirdCount.text = currentCounter.toString()
    }



}