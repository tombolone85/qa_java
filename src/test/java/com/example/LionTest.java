package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {


    @Test
    public void isLion() throws Exception {
        Lion lion = new Lion ("Самец");
        boolean expected=true;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void isLioness() throws Exception {
        Lion lion = new Lion ("Самка");
        boolean expected=false;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test(expected = java.lang.Exception.class) //Тест на исключение в 3 ветке ветвления
    public void lionIsTheIt() throws Exception {

        Lion lion1 = new Lion("The It");
        lion1.doesHaveMane();


    }

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;

    @Test
        public void lionGetsFood() throws Exception {
        Lion lion=new Lion(feline);
        List<String> expected=List.of("Животные", "Птицы", "Рыба");
        List<String> actual=lion.getFood();
        assertEquals(expected, actual);}


    @Test
    public void lionGetsKittens() {
        Lion lion=new Lion(feline);
        int expected=1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual=lion.getKittens();
        assertEquals(expected,actual);}

    @Test
    public void ifLionHasMane() throws Exception {
        Lion lion=new Lion("Самец");
        boolean expected=true;
        boolean actual=lion.doesHaveMane();
        assertEquals(expected,actual);}

    @Test
    public void ifLionessHasMane() throws Exception {
        Lion lion=new Lion("Самка");
        boolean expected=false;
        boolean actual=lion.doesHaveMane();
        assertEquals(expected,actual);}

}

