public class PrasingValuesFromAString {
    public static void main(String[] args) {
        String numberAsString = "2021";
        System.out.println("numberAsString = " + numberAsString); //now the numbers are char
        int backToNumber = Integer.parseInt(numberAsString);
        System.out.println("String is back to number = " + backToNumber); //it only works if it is number, if it would be 2021a, it would fail

        numberAsString +=1;
        backToNumber +=1;
        System.out.println("number as string " + numberAsString); //20211 because 2021 is still txt
        System.out.println("back to number as " + backToNumber); //now +1 calc works because its number + number
    }
}
