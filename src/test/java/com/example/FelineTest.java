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

@Mock
Feline feline;

    @Test
    public void felineGetsFamily() {
        String expected="Кошачьи";
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        String actual=feline.getFamily();
        assertEquals(expected,actual);
    }

    @Test
    public void felineGetsKittens() {
        int expected=1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual=feline.getKittens();
        assertEquals(expected,actual);
    }

    @Test
    public void felineEatsMeat() throws Exception {
        List<String> expected=List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual=feline.eatMeat();
        assertEquals(expected,actual);
    }
}