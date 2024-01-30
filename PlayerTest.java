package com.cardgame;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class PlayerTest {

    @Test
    public void testGetPlayerIndex() {
        Player player = new Player(1,new CardDeck(1),new CardDeck(2), new CardGame());
        assertEquals (1,player.getPlayerIndex());
    }

    @Test
    public void testHandAsString() {
        Player player = new Player(2, new CardDeck(2), new CardDeck(3), new CardGame());
        // Create a sample hand of cards
        ArrayList<Card> testHand = new ArrayList<>();
        testHand.add(new Card(1));
        testHand.add(new Card(2));
        testHand.add(new Card(3));
        testHand.add(new Card(4));

        // Call the setHand method
        player.setHand(testHand);

        String result = player.handAsString();
        // Check if the hand is set correctly
        assertEquals("1 2 3 4 ", result);
    }

    @Test
    public void testDropCard() {
        Player player = new Player(3, new CardDeck(3), new CardDeck(4), new CardGame());
        ArrayList<Card> testHand = new ArrayList<>();
        testHand.add(new Card(1));
        testHand.add(new Card(2));
        testHand.add(new Card(3));
        testHand.add(new Card(4));

        // Call the setHand method
        player.setHand(testHand);
        assertEquals(testHand.get(0), player.dropCard());
    }

    @Test
    public void testCheckForWinningHandFalse() {
        Player player = new Player(4, new CardDeck(4), new CardDeck(1), new CardGame());
        ArrayList<Card> testHand = new ArrayList<>();
        testHand.add(new Card(1));
        testHand.add(new Card(2));
        testHand.add(new Card(3));
        testHand.add(new Card(4));
        player.setHand(testHand);
        assertFalse(player.checkForWinningHand());
    }

    @Test
    public void testCheckForWinningHandTrue() {
        Player player = new Player(4, new CardDeck(4), new CardDeck(1), new CardGame());
        ArrayList<Card> testHand = new ArrayList<>();
        testHand.add(new Card(4));
        testHand.add(new Card(4));
        testHand.add(new Card(4));
        testHand.add(new Card(4));
        player.setHand(testHand);
        assertTrue(player.checkForWinningHand());
    }
}