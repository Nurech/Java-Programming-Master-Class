package Section6;

public class Animal { // gives constructor to Section6OOP1ClassesConstructors.Dog

    public static void main(String[] args) {
        Animal animal = new Animal("Section6OOP1ClassesConstructors.Animal", 1, 1, 5, 5); // base animal definition

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4,1,20,"long silky");
        dog.eat();
        dog.run();
    }

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Section6OOP1ClassesConstructors.Animal Eat Called");

    }
    public void move(int speed){

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
