public class Dog extends Animal {
    private String breed; // Extra variable

    public Dog(String name, int age, String colour, double weight, String breed) {
        super(name, age, colour, weight);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String makeSound() {
        return "Woof! I am " + getName() + ", a " + getAge() + " year old dog";
    }
}