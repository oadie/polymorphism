package com.generation.beast;

public abstract class Beast {

    protected String name;
    protected int age;
    protected String color;


    public Beast(String name) {
        this.name = name;
        System.out.println("--------------------------------------I am a beast");
        System.out.println(name);
    }

    public void snarl() {
        System.out.println("grrahrr");
    }

    public void eat(){
        System.out.println("the beast is eating");
    }

    public void run(){
        System.out.println("the beast is running");
    }

    public abstract void wild();
}
