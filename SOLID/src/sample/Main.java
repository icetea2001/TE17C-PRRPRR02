package sample;


public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black"),
                            new Hedgehog("Pink"),
                            new Bird("Yellow"),
                            new Snake("Black and Yellow")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            activateAnimal(animal);
            System.out.println();

            System.out.println("###############");
            System.out.println();
        }
    }

    private static void activateAnimal(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.speak();
        printAnimalDescription(animal.getClass().getSimpleName());
    }

    private static void printAnimalDescription(String simpleName) {
        switch (simpleName)
        {
            case "Dog":
                System.out.println("Its a dog!");
                break;
            case "Bird":
                System.out.println("Its some kind of Bird!");
                break;
            case "Hedgehog":
                System.out.println("Sonic?");
                break;
            case "Snake":
                System.out.println("Oh heck its a Snaek!");
                break;
            default:
                System.out.println("ANIMAL!");
                break;
        }
    }
}
