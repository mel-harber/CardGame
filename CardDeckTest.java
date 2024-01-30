package com.cardgame;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class CardDeckTest {

    @Test
    public void testGetDeckIndex() {
        CardDeck cardDeck = new CardDeck(1);
        assertEquals(1, cardDeck.getDeckIndex());
    }

    @Test
    public void testDeckAsString() {
        CardDeck cardDeck = new CardDeck(1);
        ArrayList<Card> testDeck = new ArrayList<>();
        testDeck.add(new Card(1));
        testDeck.add(new Card(2));
        testDeck.add(new Card(3));
        testDeck.add(new Card(4));

        // Call the setHand method
        cardDeck.setDeck(testDeck);

        String result = cardDeck.deckAsString();
        // Check if the hand is set correctly
        assertEquals("1 2 3 4 ", result);
    }

    @Test
    public void testTakeCard() {
        CardDeck cardDeck = new CardDeck(1);
        ArrayList<Card> testDeck = new ArrayList<>();
        testDeck.add(new Card(1));
        testDeck.add(new Card(2));
        testDeck.add(new Card(3));
        testDeck.add(new Card(4));

        // Call the setHand method
        cardDeck.setDeck(testDeck);
        assertEquals(testDeck.get(0), cardDeck.takeCard());
    }
}