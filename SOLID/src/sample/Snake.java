package sample;

public class Snake extends Animal {

    public Snake(String color) {
        super(color);
    }

    void speak() {
        System.out.println("Dog is barking!");
    }

    void sleep() {
        System.out.println("Dog is sleeping!");
    }

    void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void walk() {
        System.out.println("Slithering!");
    }
}
