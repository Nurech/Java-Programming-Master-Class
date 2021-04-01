package Section6;

public class Dog extends Animal { // takes constructor from Section6OOP1ClassesConstructors.Animal, takes the basics of Section6OOP1ClassesConstructors.Animal

    // now were in Section6OOP1ClassesConstructors.Dog and we can add unique things to Section6OOP1ClassesConstructors.Dog while we have base characteristics from Section6OOP1ClassesConstructors.Animal
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

// we remove some parameters that are by default true anyways
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Section6OOP1ClassesConstructors.Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void move(int speed){
        System.out.println("Section6OOP1ClassesConstructors.Animal.move() called. Section6OOP1ClassesConstructors.Animal is moving at: " +speed);
    }


    public void walk(){
        System.out.println("Section6OOP1ClassesConstructors.Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Section6OOP1ClassesConstructors.Dog.run() called");
        move(10);
    }


}
