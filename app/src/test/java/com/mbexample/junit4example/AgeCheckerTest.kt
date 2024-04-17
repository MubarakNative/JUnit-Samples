package com.mbexample.junit4example

import com.mbexample.junit4example.basictest.AgeChecker
import junit.framework.TestCase.assertEquals
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.lang.IllegalArgumentException
import java.util.regex.Matcher

class AgeCheckerTest {

    private lateinit var ageCheckerTest: AgeChecker
    @Before
    fun initialize(){
        ageCheckerTest = AgeChecker()
    }

    @Test
    fun `CheckAge 5 years Should return Child`(){
        assertEquals("Child",ageCheckerTest.checkAge(5))
    }

    @Test
    fun `Invalid age should throw exception`(){
        Assert.assertThrows("120 should throw exception",IllegalArgumentException::class.java){
            ageCheckerTest.checkAge(120)
        }
    }
}