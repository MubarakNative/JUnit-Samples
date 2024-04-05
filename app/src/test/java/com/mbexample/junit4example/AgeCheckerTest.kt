package com.mbexample.junit4example

import com.mbexample.junit4example.basictest.AgeChecker
import junit.framework.TestCase.assertEquals
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.lang.IllegalArgumentException

class AgeCheckerTest {

    private lateinit var ageCheckerTest: AgeChecker
    @Before
    fun initialize(){
        ageCheckerTest = AgeChecker()
    }

    @Test
    fun `5 yrs should be children`(){
        assertEquals("5 yrs should be child","You are children",ageCheckerTest.checkAge(5))
    }

    @Test
    fun `invalid age should throw exception`(){
        Assert.assertThrows("0 should throw exception",IllegalArgumentException::class.java){
            ageCheckerTest.checkAge(0)
        }
    }
}