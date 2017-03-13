package com.mateuszkoslacz.pitesttest

import com.nhaarman.mockito_kotlin.any
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by mateuszkoslacz on 10.03.2017.
 */
@RunWith(MockitoJUnitRunner::class)
class CalculatorWithDelegatesTest {

    @Mock
    lateinit var divisionDelegate: DivisionDelegate

    @InjectMocks
    var calculator = CalculatorWithDelegates()

    @Before
    fun init() {
        Mockito.`when`(divisionDelegate.divide(any(), any())).thenReturn(3)
    }

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
