package Section7.Encapsulation;

public class Main {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        player.loseHealth(51);








        // This is a bad way to solve this. Because if we change Player we manually have to change this too
//    Player player = new Player();
//    player.fullName = "Tim";
//    player.health = 20;
//    player.weapon = "Sword";
//
//    int damage = 10;
//    player.loseHealth(damage);
//    System.out.println("Remaining health = " +player.healthRemaining());
//
//    damage = 11;
//    // player.health = 200; we can't have this public now can we?
//    player.loseHealth(damage);
//    System.out.println("Remaining health = " +player.healthRemaining());

    }

}
