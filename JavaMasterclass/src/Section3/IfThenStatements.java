package Section3;

public class IfThenStatements {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) { // if ture statement is set true, it is "false" and will not print
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
            System.out.println();
        }

        int topScore = 100;

        int secondScore = 95;
        if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100. It is = " + topScore);
        }

        if ((topScore > 90) || (secondScore <= 90)) ;
        System.out.println("Either or both conditions are true");

        int newValue = 50;
        if (newValue == 50) { //peab kasutama == mitte =, compare is equal
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) { // if you use boolean = it will equal true becase checks boolean, if use == checks for value true/false
            System.out.println("This is not supposed to happen1");
        }
        boolean isCar2 = false;
        if (!isCar2) { // isCar2 is not TRUE for isCar2
            System.out.println("This is not supposed to happen2");
        }
        isCar = true;
        boolean wasCar = isCar;
        if (wasCar) {
            System.out.println("wasCare is true.");
        }


    }
}
