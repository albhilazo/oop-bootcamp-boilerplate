package oop.rectangle;

import oop.rectangle.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    public void setup() {
        this.rectangle = new Rectangle(10, 20);
    }

    @Test
    public void itShouldProvidePerimeter() {
        float perimeter = rectangle.perimeter();
        assertEquals(60, perimeter);
    }

    @Test
    public void itShouldProvideArea() {
        float area = rectangle.area();
        assertEquals(200, area);
    }

}
