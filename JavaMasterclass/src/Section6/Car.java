package Section6;

public class Car { // accessible from anywhere

    private int doors; // state of the car - 5 fields
    private int wheels; // were creating object from the class Section6OOP1ClassesConstructors.Car, so its a blueprint for the object
    private String model; // updating this model using below Method
    private String engine;
    private String color;



    public void setModel(String model) { //setter
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commadore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;  //were returning model field
    }
}
