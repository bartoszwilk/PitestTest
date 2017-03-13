package com.mateuszkoslacz.pitesttest

/**
 * Created by mateuszkoslacz on 10.03.2017.
 */

class CalculatorWithDelegates {

    private var divisionDelegate = DivisionDelegate()

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun substract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return divisionDelegate.divide(a, b)
    }
}
