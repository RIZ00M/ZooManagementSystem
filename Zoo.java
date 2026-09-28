public class Zoo {
    private String zooName;
    private Animal[] animalArray;
    private int animalCount;

    public Zoo(String zooName) {
        this.zooName = zooName;
        animalArray = new Animal[500]; // Size of zoo.
        animalCount = 0;
    }

    public void addAnimal(Animal animal) {
        // If data is empty it should be checked first to ensure data integrity.
        if (animal.getName().isEmpty() || animal.getAge() <= 0 || animal.getColour().isEmpty() || animal.getWeight() <= 0) {
            System.out.println("Invalid data entry. Please check all fields filled in. Age and weight fields have to be greater than 0.");
            return;
        }
        // Then check if the zoo has enough space for another entry to be added.
        if (animalCount < animalArray.length) {
            animalArray[animalCount++] = animal;
            System.out.println(animal.getName() + " added to the zoo!");
        } else {
            System.out.println("Zoo is full, no more data can be added. You can use the removeAnimals() method to remove an animal.");
            return;
        }
    }

    public void removeAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animalArray[i].getName().equalsIgnoreCase(name)) {
                animalArray[i] = animalArray[animalCount - 1];
                animalArray[animalCount - 1] = null;
                animalCount--;
                System.out.println(name + "removed");
                return;
            }
        }
        System.out.println("Animal not found & therefore not deleted.");
    }

    public void viewAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animalArray[i].makeSound());
        }
    }

    public void searchAnimal(String input) {
        boolean found = false;
        for (int i = 0; i < animalCount; i++) {
            if (animalArray[i].getName().equalsIgnoreCase(input) || animalArray[i].getColour().equalsIgnoreCase(input)) {
                System.out.println(animalArray[i].makeSound());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching animal name nor colour found.");
        }
    }

    public void dailyCare() {
        for (int i = 0; i < animalCount; i++) {
            Animal animal = animalArray[i];
            // If the animal can fly, check its wing health.
            if(animal instanceof Flyable) ((Flyable)animal).checkWingHealth();
            // If the animal can swim, check the water health.
            if(animal instanceof Swimmable) ((Swimmable)animal).checkWaterHealth();
        }
    }

    public void report() {
        int dogs = 0, birds = 0, fish = 0;

        String[] colours = new String[animalCount]; // Stores different colours
        int[] coloursCount = new int[animalCount]; // How many animals have that colour.
        int uniqueColours = 0; // Number of unique colours colours

        for (int i = 0; i < animalCount; i++) {
            Animal animal = animalArray[i];

            // Count animal types
            if (animal instanceof Dog) dogs++;
            else if (animal instanceof  Bird) birds++;
            else if (animal instanceof  Fish) fish++;

            // Count animal colours
            String colour = animal.getColour().toLowerCase();
            boolean found = false;

            for (int x = 0; x < uniqueColours; x++) {
                if (colours[x].equalsIgnoreCase(colour)) {
                    coloursCount[x]++;
                    found = true; // This colour has been counted, lets move onto the next colour.
                    break;
                }
            }

            if (!found) {
                colours[uniqueColours] = colour;
                coloursCount[uniqueColours] = 1;
                uniqueColours++;
            }
        }

        String dominantColour = "No colours were entered.";
        int maxCount = 0;

        // Find most dominant colour
        for (int i = 0; i < uniqueColours; i++) {
            if (coloursCount[i] > maxCount) {
                maxCount = coloursCount[i];
                dominantColour = colours[i];
            }
        }

        // Print out the report
        System.out.println("\nZoo Report");
        System.out.println("Zoo name: " + zooName);
        System.out.println("Amount of dogs: " + dogs);
        System.out.println("Amount of birds: " + birds);
        System.out.println("Amount of fish: " + fish);
        System.out.println("Most common colour: " + dominantColour);
    }

    public void saveToFiles() {

    }

}
