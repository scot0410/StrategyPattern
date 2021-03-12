public class StrategyPattern{
    public static void main(String[] args){
        System.out.println("");
        System.out.println("~~~ Fight!! ~~~");
        System.out.println("Here's the fighter's moves: ");

        Fighter fighter = new Fighter();
        Fighter chunLi = new ChunLi();
        Fighter ryu = new Ryu();

        fighter.display();
        chunLi.display();
        ryu.display();

        System.out.println("");
        System.out.println("Ryu makes the first move...");
        ryu.performJump();

        System.out.println("Chun-Li attacks!!!");
        chunLi.punch();

        System.out.println("Ryu rolls back to reduce the damage...");
        ryu.performRoll();

        System.out.println("Ryu counters!!!");
        ryu.kick();

        System.out.println("Chun-Li dodges the attack!!");
        chunLi.performRoll();
        chunLi.performJump();

        System.out.println("");
        System.out.println("!!! The fight ensues !!!");
        System.out.println("");

    }
}

/**
 * We separate behaviors to their own interface, and have classes inherit the behavior they'll use.
 *
 * ~~ Design Principle ~~
 * Identify the aspects of your application
 * that vary and separate them from what stays the same.
 *
 * ~~ OO Principles ~~
 * - Encapsulate what varies
 * - Favor Composition over inheritance
 * - Program to the interface, not the implementaion
 */