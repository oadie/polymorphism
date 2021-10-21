package com.generation;

import com.generation.beast.Beast;
import com.generation.beast.Canine;
import com.generation.beast.Panther;

public class Main {

    public static void main(String[] args) {

        Panther tiger = new Panther("tiger");
        tiger.snarl();

        // Beast bear = new Beast("bear");
        // bear.eat();

        Canine dog = new Canine("dog", 4);
        System.out.println(dog.getLegs());
        dog.eat();

        Panther cheetah = new Panther("cheetah");
        cheetah.run();

    }
}
