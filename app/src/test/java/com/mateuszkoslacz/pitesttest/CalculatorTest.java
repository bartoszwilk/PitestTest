package com.mateuszkoslacz.pitesttest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mateuszkoslacz on 10.03.2017.
 */
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void add() throws Exception {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void substract() throws Exception {
        assertEquals(8, calculator.substract(10, 2));
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void divide() throws Exception {
        assertEquals(3, calculator.divide(6, 2));
    }

}