package com.idea.designpatterns.template;

public class TemplateDemo {
    public static void main(String[] args) {
        DodishTemplate dodishTemplate = new EggsWithTomato();
        dodishTemplate.dodish();
    }

}
