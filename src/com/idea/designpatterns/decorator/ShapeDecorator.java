package com.idea.designpatterns.decorator;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    public void drwa(){
        decoratorShape.draw();
    }
}
