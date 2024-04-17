package com.mbexample.junit4example

import com.mbexample.junit4example.basictest.Calculator
import junit.framework.TestCase.assertEquals
import org.junit.Assert.assertThrows
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

    @Test
    fun `division of 50 div 5 should return 10`(){
        assertEquals("50 / 10 should be 5",10,calculator.div(50,5))

    }

    @Test
    fun `division of 10 div 0 should throws exception`(){
        assertThrows("10 / 0 should throws exception",ArithmeticException::class.java){
            calculator.div(10,0)
        }
    }
}