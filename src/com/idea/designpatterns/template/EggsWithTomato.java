package com.idea.designpatterns.template;

public class EggsWithTomato extends DodishTemplate{
    @Override
    public void preparation() {
        System.out.println("洗并切西红柿，打鸡蛋。");
    }

    @Override
    public void doing() {
        System.out.println("鸡蛋倒入锅里，然后倒入西红柿一起炒。");
    }

    @Override
    public void carriedDishes() {
        System.out.println("将炒好的西红柿鸡蛋装入碟子里，端给客人吃。");
        System.out.println("新增第一行信息");
        System.out.println("新增第二行信息");
        System.out.println("新增第三行信息");
    }
}
