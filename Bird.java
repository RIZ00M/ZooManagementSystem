public class Bird extends Animal implements Flyable {
    private double beakSize; // Extra instance variable

    public Bird(String name, int age, String colour, double weight, double beakSize) {
        super(name, age, colour, weight);
        this.beakSize = beakSize;
    }

    public String makeSound() { // Override the sound from animal class
        return "Tweet! I am " + getName() + ", a " + getAge() + " year old bird";
    }

    public void flapWings() {
        System.out.println(getName() + " is flapping their wings!");
    }

    public void checkWingHealth() {
        System.out.println("Checking wing health for " + getName());
        // System.out.println("Age: " + Animal.name);
    }
}