package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)



public class LionTest {
    @Mock
    Feline feline;


    @Test
    public void lionShouldHaveAMane() throws Exception {
        Lion lion = new Lion ("Самец", feline);
        boolean expected=true;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void lionessShouldntHaveAMane() throws Exception {
        Lion lion = new Lion ("Самка",feline);
        boolean expected=false;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test(expected = java.lang.Exception.class) //Тест на исключение в 3 ветке ветвления
    public void thirdGenderException() throws Exception {

        Lion lion1 = new Lion("The It",feline);
        lion1.doesHaveMane();


    }

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
        public void lionGetsFood() throws Exception {
        Lion lion=new Lion("Самец",feline);
        List<String> expected=List.of("Животные", "Птицы", "Рыба");
        List<String> actual=lion.getFood();
        assertEquals(expected, actual);
    }


    @Test
    public void lionGetsKittens() throws Exception {
        Lion lion=new Lion("Самец", feline);
        int expected=1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual=lion.getKittens();
        assertEquals(expected,actual);
    }

    @Test
    public void ifLionHasMane() throws Exception {
        Lion lion=new Lion("Самец", feline);
        boolean expected=true;
        boolean actual=lion.doesHaveMane();
        assertEquals(expected,actual);
    }

    @Test
    public void ifLionessHasMane() throws Exception {
        Lion lion=new Lion("Самка",feline);
        boolean expected=false;
        boolean actual=lion.doesHaveMane();
        assertEquals(expected,actual);
    }

}

