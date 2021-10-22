package com.generation;

import com.generation.Uber.UberBlackDriver;
import com.generation.Uber.UberDriver;
import com.generation.beast.Beast;
import com.generation.beast.Canine;
import com.generation.beast.Fox;
import com.generation.beast.Panther;

public class Main {

    public static void main(String[] args) {

        UberDriver Paco = new UberDriver();
        UberBlackDriver Fer = new UberBlackDriver();

        System.out.println("Uber");
        System.out.println(Paco.calculatePrice(6));
        System.out.println("Uber Black");
        System.out.println(Fer.calculatePrice(6));

        Panther tiger = new Panther("tiger");
        tiger.snarl();

        // Beast bear = new Beast("bear");
        // bear.eat();

        Canine dog = new Canine("dog");
        System.out.println(dog.getLegs());
        dog.eat();

        Panther cheetah = new Panther("cheetah");
        cheetah.run();

        Fox Mr = new Fox("Mr. Fox");
        Mr.wild();

    }
}
