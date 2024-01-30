package com.cardgame;

import org.junit.Test;
import static org.junit.Assert.*;


public class CardTest {

    @Test
    public void testConstructor() {
        int expectedFaceValue = 10;
        Card card = new Card(expectedFaceValue);
        assertEquals(expectedFaceValue, card.faceValue());
    }

    @Test
    public void testDefaultConstructor() {
        Card card = new Card(0);
        assertEquals(0, card.faceValue());
    }

    @Test
    public void testGetFaceValue() {
        int expectedFaceValue = 2;
        Card card = new Card(expectedFaceValue);
        assertEquals(expectedFaceValue, card.faceValue());
    }
}
