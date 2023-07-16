package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.a
import kotlinx.android.synthetic.main.activity_main.d
import kotlinx.android.synthetic.main.activity_main.m
import kotlinx.android.synthetic.main.activity_main.n1
import kotlinx.android.synthetic.main.activity_main.n2
import kotlinx.android.synthetic.main.activity_main.n3
import kotlinx.android.synthetic.main.activity_main.s

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a.setOnClickListener {
            if(n1.text.toString() != "" && n2.text.toString() != ""){
                val num1 = n1.text.toString().toInt()
                val num2 = n2.text.toString().toInt()
                val sum = num1+num2
                n3.text = sum.toString()
            }
        }
        s.setOnClickListener {
            if(n1.text.toString() != "" && n2.text.toString() != ""){
                val num1 = n1.text.toString().toInt()
                val num2 = n2.text.toString().toInt()
                val substraction = num1-num2
                n3.text = substraction.toString()
            }
        }
        m.setOnClickListener {
            if(n1.text.toString() != "" && n2.text.toString() != ""){
                val num1 = n1.text.toString().toInt()
                val num2 = n2.text.toString().toInt()
                val multiplication = num1*num2
                n3.text = multiplication.toString()
            }
        }
        d.setOnClickListener {
            if(n1.text.toString() != "" && n2.text.toString() != ""){
                val num1 = n1.text.toString().toFloat()
                val num2 = n2.text.toString().toInt()
                val divide = num1/num2
                n3.text = divide.toString()
            }
        }
    }
}