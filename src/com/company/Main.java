package com.company;

public class Main {

    public static void main(String[] args) {

        Car audi = new Car();
        System.out.println(audi.isRunning);
        audi.start();
        System.out.println(audi.isRunning);
        audi.stop();
        System.out.println(audi.isRunning);


        Wolf w1 = new Wolf();
        System.out.println(w1.makeNoise());
        System.out.println(w1.roam());




    }
}
