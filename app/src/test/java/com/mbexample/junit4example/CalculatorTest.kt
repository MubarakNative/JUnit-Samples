package com.mbexample.junit4example

import com.mbexample.junit4example.basictest.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun initialize(){
        calculator = Calculator()
    }

    @Test
    fun `sum of 2+2 should be 4`(){
        assertEquals("2+2 should be 4",4,calculator.add(2,2))
    }

    @Test
    fun `sum of 5+3 should be 8`(){
        assertEquals("5+3 should be 8",8,calculator.add(5,3))
    }

    @Test
    fun `subtraction of 5-2 should be 3`(){
        assertEquals("5-2 should be 3",3,calculator.subtract(5,2))
    }
}