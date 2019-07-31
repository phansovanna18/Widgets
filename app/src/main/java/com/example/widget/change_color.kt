package com.example.widget

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_change_color.*

class change_color : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_color)

        class Listen : SeekBar.OnSeekBarChangeListener
        {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                btn.setBackgroundColor(Color.argb(alpha.progress,red.progress,green.progress,blue.progress))
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}
        }

        btn = findViewById(R.id.btn1)
        var listSeekBar = listOf<SeekBar>(alpha,red,green,blue)
        var listener = Listen()

        for(x in listSeekBar)
        {
            x.max = 255
            x.setOnSeekBarChangeListener(listener)
        }
    }

    lateinit var btn : Button

    fun click(view: View)
    {
        when(view.id)
        {

            R.id.btn1 -> btn = findViewById(R.id.btn1)
            R.id.btn2 -> btn = findViewById(R.id.btn2)
            R.id.btn3 -> btn = findViewById(R.id.btn3)
            R.id.btn4 -> btn = findViewById(R.id.btn4)
        }
    }
}
