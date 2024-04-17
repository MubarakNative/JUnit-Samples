package com.mbexample.junit4example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mbexample.junit4example.basictest.AgeChecker
import com.mbexample.junit4example.basictest.Calculator

class MainActivity : AppCompatActivity() {

    private lateinit var calculator: Calculator
    private lateinit var ageChecker: AgeChecker
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculator = Calculator()
        ageChecker = AgeChecker()

        val sum = calculator.add(1,4)
        println(sum)

        val age = ageChecker.checkAge(16)
        println(age)

    }
}