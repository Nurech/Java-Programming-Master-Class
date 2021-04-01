public class Dog extends Animal{ // takes constructor from Animal, takes the basics of Animal

    // now were in Dog and we can add unique things to Dog while we have base characteristics from Animal
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
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at: " +speed);
    }


    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }


}
