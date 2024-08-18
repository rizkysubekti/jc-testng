package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        int expected = 15;
        int actual = calculator.add(10,5);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSubtract(){
        int expected = 5;
        int actual = calculator.subtract(10,5);
        Assert.assertEquals(actual,expected);
    }

}
