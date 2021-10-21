package com.generation.beast;

public class Canine extends Beast {
    private int legs;
    private String race;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Canine(String name, int legs) {
        super(name);
        this.legs = legs;
    }

    public void bark() {
        System.out.println("guahf!");
    }

    @Override
    public void eat(){
        System.out.println("croquettes");
    }

    @Override
    public void wild(){
        System.out.println("I'm wild");
    }
}
