package com.mateuszkoslacz.pitesttest

import org.junit.Test

import org.junit.Assert.assertEquals

/**
 * Created by mateuszkoslacz on 10.03.2017.
 */
class CalculatorTest {

    private val calculator = Calculator()

    @Test
    @Throws(Exception::class)
    fun add() {
        assertEquals(5, calculator.add(2, 3).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun substract() {
        assertEquals(8, calculator.substract(10, 2).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun multiply() {
        assertEquals(12, calculator.multiply(3, 4).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun divide() {
        assertEquals(3, calculator.divide(6, 2).toLong())
    }

}