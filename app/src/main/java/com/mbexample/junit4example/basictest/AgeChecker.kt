package com.mbexample.junit4example.basictest

class AgeChecker {
    fun checkAge(age:Int): String{
        return when(age){
            in 1 .. 11 -> {
                "Child"
            }
            in 12..27 -> {
                "Gen Z"
            }

            in 28..43 -> {
                "Millennial's"
            }

            in 44 .. 59 -> {
                "Gen X"
            }
            in 60 .. 69 -> {
                "Generation Jones"
            }

            in 70..78 -> {
                "Boomers"
            }

            in 79..96 -> {
                "Post War"
            }

            in 97 .. 102 -> {
                "WWII"
            }
            else -> throw IllegalArgumentException("Invalid Age")
        }
    }
}