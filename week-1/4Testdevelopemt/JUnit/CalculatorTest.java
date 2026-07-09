package com.cognizant.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class calctest{

    calc c;

    @BeforeEach
    void set(){
        c=new calc();
    }

    @Test
    void add(){
        assertEquals(30,c.add(10,20));
    }

    @Test
    void sub(){
        assertEquals(5,c.sub(15,10));
        assertEquals(-5,c.sub(10,15));
        assertEquals(0,c.sub(10,10));
    }

    @Test
    void mul(){
        assertEquals(20,c.mul(4,5));
        assertEquals(0,c.mul(0,5));
        assertEquals(-20,c.mul(-4,5));
    }

    @Test
    void div(){
        assertEquals(2.0,c.div(10,5));
        assertEquals(0.5,c.div(1,2));
    }

    @Test
    void zero(){
        assertThrows(IllegalArgumentException.class,()->{
            c.div(10,0);
        });
    }

    @Test
    void pos(){
        assertTrue(c.pos(5));
        assertFalse(c.pos(-5));
        assertFalse(c.pos(0));
    }

    @Test
    void even(){
        assertTrue(c.even(4));
        assertTrue(c.even(0));
        assertFalse(c.even(3));
        assertFalse(c.even(-3));
    }
}