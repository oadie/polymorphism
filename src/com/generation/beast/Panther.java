package com.generation.beast;
    public class Panther extends Beast {
        private String color;

        public Panther(String name){
            //constructor de padre
            super(name);

        }

        public void catFood (){
            System.out.println("");
        }

        @Override
        public void wild(){
            System.out.println("I'm wild");
        }
    }
