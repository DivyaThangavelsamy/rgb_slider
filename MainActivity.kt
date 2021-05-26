package com.example.rgbslider

import android.graphics.Color.rgb
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.rgbslider.databinding.ActivityMainBinding
import com.google.android.material.slider.Slider
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        binding.redSlider.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                // Can use to implement if slider's touch event is being started
            }
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onStopTrackingTouch(slider: Slider) {
                binding.constLayout.setBackgroundColor(
                    rgb(
                        binding.redSlider.value,
                        binding.greenSlider.value,
                        binding.blueSlider.value
                    )
                )
                binding.rgbValue.text =
                    "R : ${binding.redSlider.value.roundToInt()}\nG : ${binding.greenSlider.value.roundToInt()} \nB : ${binding.blueSlider.value.roundToInt()}"
            }
        })

        binding.greenSlider.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                // Can use to implement if slider's touch event is being started
            }

            @RequiresApi(Build.VERSION_CODES.O)
            override fun onStopTrackingTouch(slider: Slider) {
                binding.constLayout.setBackgroundColor(
                    rgb(
                        binding.redSlider.value,
                        binding.greenSlider.value,
                        binding.blueSlider.value
                    )
                )
                binding.rgbValue.text =
                    "R : ${binding.redSlider.value.roundToInt()}\nG : ${binding.greenSlider.value.roundToInt()} \nB : ${binding.blueSlider.value.roundToInt()}"
            }
        })

        binding.blueSlider.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                // Can use to implement if slider's touch event is being started
            }

            @RequiresApi(Build.VERSION_CODES.O)
            override fun onStopTrackingTouch(slider: Slider) {
                binding.constLayout.setBackgroundColor(
                    rgb(
                        binding.redSlider.value,
                        binding.greenSlider.value,
                        binding.blueSlider.value
                    )
                )
                binding.rgbValue.text =
                    "R : ${binding.redSlider.value.roundToInt()}\nG : ${binding.greenSlider.value.roundToInt()} \nB : ${binding.blueSlider.value.roundToInt()}"
            }
        })
    }
}
