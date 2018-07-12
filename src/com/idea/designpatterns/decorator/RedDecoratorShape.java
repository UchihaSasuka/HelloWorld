package com.idea.designpatterns.decorator;

public class RedDecoratorShape extends ShapeDecorator{


    public RedDecoratorShape(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("Border Color : Red");
    }
}
