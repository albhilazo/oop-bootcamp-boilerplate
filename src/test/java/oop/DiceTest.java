package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceTest {

    private Dice dice;

    @BeforeEach
    public void setup() {
        this.dice = new Dice();
    }

    @Test
    public void itShouldProvideChanceOf6() {
        double chance = dice.chanceOf6();
        assertEquals((double) 1/(double) 6, chance);
    }

}
