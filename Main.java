import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Zoo zoo = new Zoo("Ulster Zoo");
        // zoo.loadFromFiles();

        int inputChoice = 0;
        while(inputChoice != 9){
            System.out.println("\nXXX Zoo Management Intereface XXX");
            System.out.println("1. Add Dog");
            System.out.println("2. Add Bird");
            System.out.println("3. Add Fish");
            System.out.println("4. View Animals");
            System.out.println("5. Remove Animal");
            System.out.println("6. Search Animal");
            System.out.println("7. ZooKeeper Care");
            System.out.println("8. Zoo Report");
            System.out.println("9. Exit");
            System.out.print("Choice: ");
            inputChoice = scan.nextInt();
            scan.nextLine();

            switch(inputChoice){

                case 1:
                    System.out.print("Name: "); String name = scan.nextLine();

                    System.out.print("Age: "); int age = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Colour: "); String colour = scan.nextLine();

                    System.out.print("Weight: "); double weight = scan.nextDouble();
                    scan.nextLine();

                    System.out.print("Breed: "); String breed = scan.nextLine();

                    zoo.addAnimal(new Dog(name, age, colour, weight, breed)); // Set dog attributes

                    break;

                case 2:
                    System.out.print("Name: "); name = scan.nextLine();

                    System.out.print("Age: "); age = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Colour: "); colour = scan.nextLine();

                    System.out.print("Weight: "); weight = scan.nextDouble();
                    scan.nextLine();

                    System.out.print("Wing span: "); double wingSpan = scan.nextDouble();
                    scan.nextLine();

                    zoo.addAnimal(new Bird(name, age, colour, weight, wingSpan)); // Set bird attributes

                    break;

                case 3:
                    System.out.print("Name: "); name = scan.nextLine();

                    System.out.print("Age: "); age = scan.nextInt(); scan.nextLine();

                    System.out.print("Colour: "); colour = scan.nextLine();

                    System.out.print("Weight: "); weight = scan.nextDouble(); scan.nextLine();

                    System.out.print("Beak size: "); int beakSize = scan.nextInt(); scan.nextLine();

                    zoo.addAnimal(new Fish(name, age, colour, weight, beakSize));

                    break;

                case 4:

                    zoo.viewAnimals(); break;

                case 5:

                    System.out.print("Enter the name to remove: "); name = scan.nextLine();
                    zoo.removeAnimal(name); break;

                case 6:

                    System.out.print("Search by name or colour: "); String value = scan.nextLine();
                    zoo.searchAnimal(value); break;

                case 7:

                    zoo.dailyCare(); break;

                case 8:

                    zoo.report(); break;

                case 9:

                    zoo.saveToFiles();
                    System.out.println("Exiting. Data saved.");
                    break;

                default:
                    System.out.println("Invalid choice please try again");
            }
        }
    }
}