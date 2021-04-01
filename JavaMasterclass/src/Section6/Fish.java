package Section6;

public class Fish extends Animal { // part of Section6OOP1ClassesConstructors.Animal/Section6OOP1ClassesConstructors.Dog ex
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest(){

    }

    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    public void swim(int speed){
        moveBackFin();
        moveMuscles();
        super.move(speed);
    }

}
