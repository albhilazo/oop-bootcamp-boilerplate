package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {

    private Chance chance;

    private final double DELTA_TOLERANCE = 0.01d;

    @BeforeEach
    public void setup() {
        this.chance = new Chance();
    }

    @Test
    public void itShouldProvideChanceOf6() {
        double chance = this.chance.forEvent6();
        assertEquals(0.167, chance, DELTA_TOLERANCE);
    }

    @Test
    public void itShouldProvideChanceOfNot6() {
        double chance = this.chance.forEventNot6();
        assertEquals(0.833, chance, DELTA_TOLERANCE);
    }

    @Test
    public void itShouldProvideProductOfTwoChances() {
        Chance chanceA = new Chance(0.5);
        Chance actual = chanceA.productWith(new Chance(0.6));
        assertEquals(0.3, actual.getValue());
    }

    @Test
    public void itShouldProvideLogicalOrOfTwoChances() {
        Chance chanceA = new Chance(0.5);
        Chance actual = chanceA.logicalOrWith(new Chance(0.6));
        assertEquals(0.8, actual.getValue());
    }

}
