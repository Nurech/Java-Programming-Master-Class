package Section7.MasterChallange;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Saussage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.20);
        hamburger.addHamburgerAddition2("Cheese", 0.37);
        hamburger.addHamburgerAddition3("Onion", 0.40);
        hamburger.addHamburgerAddition4("Lettuce", 0.80);
        System.out.println("With additons it is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyburger = new HealthyBurger("Bacon", 5.69);
        healthyburger.addHamburgerAddition1("Egg", 1.30);
        healthyburger.addHealthyAddition1("Lentils", 1.90);
        System.out.println("Total Healthy Burger price: " + healthyburger.itemizeHamburger());

        // for some weird reason Udemy couldn't read deluxeburger decimal points so I had to force it.
        DeluxeBurger deluxeburger = new DeluxeBurger();
        deluxeburger.addHamburgerAddition3("Should not do this", 4); // instead it will show can not do this.
        System.out.println("Total Deluxe Burger price: " + (double) Math.round(deluxeburger.itemizeHamburger() * 100) / 100);

    }
}
