package com.cardgame;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CardTest.class,
        CardDeckTest.class,
        PlayerTest.class,
        CardGameTest.class
})
public class gameTestSuite {
}
