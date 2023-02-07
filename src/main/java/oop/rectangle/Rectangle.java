package oop.rectangle;

public class Rectangle {

    private final float width;
    private final float length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float perimeter() {
        return 2*(width + length);
    }

    public float area() {
        return width*length;
    }
}
