package test;

import domain.Dolphin;

public class TestAnimal {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin("Flipper", 150, "shallow");
        System.out.println(dolphin);
        System.out.println();
        dolphin.swim();
        dolphin.eat();
        dolphin.speak();
        dolphin.jump();
        dolphin.echolocate();
    }
}