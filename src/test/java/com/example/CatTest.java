package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {


    @Mock
    Feline feline;

    @Test
    public void catGetsSound() {
        Cat cat=new Cat(feline);
        String expected="Мяу";
        String actual=cat.getSound();
        assertEquals(expected,actual);
    }

    @Test
    public void catGetsFood() throws Exception {
    Cat cat=new Cat(feline);
    List<String> expected=List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    List<String> actual=cat.getFood();
    assertEquals(expected,actual);
}
}