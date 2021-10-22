package com.generation.beast;

public class Fox extends Canine implements Mascot{

    public Fox(String name) {
        super(name);
    }

    @Override
    public void accompany(){
        System.out.println("love my owner");
    }
    @Override
    public void useMoney(){
        System.out.println("I'm rich");
    }

    @Override
    public void wild(){
        System.out.println("I'm not wild");
    }
}
