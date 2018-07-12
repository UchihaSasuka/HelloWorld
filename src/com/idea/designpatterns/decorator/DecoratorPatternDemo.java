package com.idea.designpatterns.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedDecoratorShape(rectangle);
        rectangle.draw();
        redRectangle.draw();
    }
}
