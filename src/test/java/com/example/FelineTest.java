package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Test
    public void felineGetsFamily() {
Feline feline=new Feline();
        String expected="Кошачьи";
        String actual=feline.getFamily();
        assertEquals(expected,actual);
    }

    @Test
    public void felineGetsKittens() {
        int expected=1;
Feline feline=new Feline();
        int actual=feline.getKittens();
        assertEquals(expected,actual);
    }

    @Test
    public void felineEatsMeat() throws Exception {
Feline feline=new Feline();
        List<String> expected=List.of("Животные", "Птицы", "Рыба");
        List<String> actual=feline.eatMeat();
        assertEquals(expected,actual);
    }
}