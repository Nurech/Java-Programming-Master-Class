package Section7.RoomOfHouse;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("Wast");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("My room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed(); // access method
        bedroom.getLamp().turnOn(); //access via getter

        // using getter if better if you have them, you don't have to shuffle through all methods.
    }

}
