package Section7.Computer;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 beast", "Acer", 27, new Resolution(2540, 1440));
        MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus", 4, 6, "2.44");

        //this is composition
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        //we have drawing of pixelis in monitor. But how do we access it?
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 7.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

    }
}
