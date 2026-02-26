package domain;

public class Dolphin extends Swimmer {
    private String oceanZone; // shallow / deep

    public Dolphin(String name, int weight, String oceanZone) {
        this.name = name;
        this.weight = weight;
        this.oceanZone = oceanZone;
    }

    public Dolphin() {
        this("Flipper", 150, "shallow");
    }

    public Dolphin(String name) {
        this(name, 150, "shallow");
    }

    public void jump() {
        System.out.println("Dolphin is jumping out of the water!");
    }

    public void echolocate() {
        System.out.println("Dolphin is using echolocation to find fish...");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming at high speed!");
    }

    @Override
    public void speak() {
        System.out.println("Click! Whistle! Click-click!");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin eats fish...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nZone:\t" + oceanZone + "\n\nThis is a Dolphin!";
    }
}