public class Animal {
    // Instance Variables
    private String name;
    private int age;
    private String colour;
    private double weight;

    // Animal constructor
    public Animal(String name, int age, String colour, double weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.weight = weight;
    }

    // Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

    public String makeSound() {
        return "Animal noise to be overridden";
    }
}
