package com.mbexample.junit4example.basictest

class AgeChecker {
    fun checkAge(age:Int): String{
        return when(age){
            in 1..10 -> {
                "You are children"
            }

            in 10..25 -> {
                "You are teen-ager"
            }

            in 25 .. 35 -> {
                "You are super"
            }
            in 35 .. 45 -> {
                "You are old"
            }

            in 45..55 -> {
                "You are Elder old"
            }

            in 55..100 -> {
                "Very Old citizen"
            }
            else -> throw IllegalArgumentException("Invalid Age")
        }
    }
}