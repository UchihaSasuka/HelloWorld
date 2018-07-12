package com.idea.designpatterns.template;

public abstract class DodishTemplate  {
    protected void  dodish(){
        this.preparation();
        this.doing();
        this.carriedDishes();
    }

    public abstract void preparation();

    public abstract void doing();

    public abstract void carriedDishes();
}
