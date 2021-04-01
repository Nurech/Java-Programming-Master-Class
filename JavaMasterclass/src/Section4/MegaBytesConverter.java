package Section4;

public class MegaBytesConverter {

    public static int printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = (kiloBytes / 1024);
            int kiloRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kiloRemainder + " KB");
        }

        return kiloBytes;
    }

}