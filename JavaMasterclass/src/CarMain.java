public class CarMain {
    public static void main(String[] args) {
        Car porsche = new Car(); // created new Car from Car
        Car holden = new Car();
        porsche.setModel("911"); // data validation, we cant set a value that we haven't defined as true
        System.out.println("Model is " + porsche.getModel());
    }
}

