package com.example;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineKittensCountParamTest {
private final int actual;
    private final int expected;

    public FelineKittensCountParamTest(int actual,int expected) {
        this.actual = actual;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {5,5},
                {2,2},
                {3,3}
        };
    }

    @Test
    public void felineGetKittensTest(){
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(actual);
            assertEquals(actualKittensCount, expected);
    }}