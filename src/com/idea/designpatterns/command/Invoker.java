package com.idea.designpatterns.command;

public class Invoker {
    private Commond commond;

    public void setCommond(Commond commond){
        this.commond = commond;
    }

    public void action(){
        commond.command();
    }
}
