public class Fish extends Animal implements Swimmable {
    private int finSize; // Extra variable

    public Fish(String name, int age, String colour, double weight, int finCount) {
        super(name, age, colour, weight);
        this.finSize = finCount;
    }

    public void setFinSize(int finSize) {
        this.finSize = finSize;
    }

    public String makeSound() {
        return "Blob Blob! I am " + getName() + ", a " + getAge() + " year old fish";
    }

    public void swim() {
        System.out.println(getName() + " is splashing away!");
    }

    public void checkWaterHealth() {
        System.out.println("Checking water health for " + getName());
    }
}