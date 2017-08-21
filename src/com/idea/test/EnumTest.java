package com.idea.test;

/**
 * @author lipengd@zbj.com
 * @title
 * @date 2017/8/21.
 */
public enum EnumTest {
    RED("红色", 1){
        @Override
        void sayHello2() {
            System.out.println("hello2");
        }
    },
    GREEN("绿色", 2){
        @Override
        void sayHello2() {
            System.out.println("hello2");
        }
    },
    BLANK("白色", 3){
        @Override
        void sayHello2() {
            System.out.println("hello2");
        }
    },
    YELLOW("黄色", 4){
        @Override
        void sayHello2() {
            System.out.println("hello2");
        }
    };

    private String name ;
    private int index ;
    private int aaa;

    private EnumTest( String name , int index ){
        this.name = name ;
        this.index = index ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    void sayHello(String name, String index){
        switch (this){
            case RED: System.out.println(name + index + "red");break;
            case BLANK: System.out.println(name + index + "blank");break;
            case GREEN: System.out.println(name + index + "green");break;
            case YELLOW: System.out.println(name + index + "yellow");break;
            default:break;
        }

    }

    abstract void sayHello2();
}
