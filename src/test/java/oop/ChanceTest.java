package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {

    private Chance chance;

    @BeforeEach
    public void setup() {
        this.chance = new Chance();
    }

    @Test
    public void itShouldProvideChanceOf6() {
        double chance = this.chance.forEvent6();
        DecimalFormat df = new DecimalFormat("#.###");
        assertEquals(0.167, Double.valueOf(df.format(chance)));
    }

    @Test
    public void itShouldProvideChanceOfNot6() {
        double chance = this.chance.forEventNot6();
        DecimalFormat df = new DecimalFormat("#.###");
        assertEquals(0.833, Double.valueOf(df.format(chance)));
    }

}
