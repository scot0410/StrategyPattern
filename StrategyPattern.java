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
        //performJump is decided at runtime
        ryu.performJump();// <-- THIS perform jump is different than Chun-Li

        System.out.println("Chun-Li attacks!!!");
        chunLi.punch();

        System.out.println("Ryu rolls back to reduce the damage...");
        ryu.performRoll();

        System.out.println("Ryu counters!!!");
        ryu.kick();

        System.out.println("Chun-Li dodges the attack!!");
        chunLi.performRoll();
        chunLi.performJump(); // <-- THIS perForm jump is different than Ryu

        System.out.println("");
        System.out.println("!!! The fight ensues, but not very dynamically... !!!");
        System.out.println("");

        System.out.println("Chun-Li and Ryu each call the same performJump method, but with different outcomes.");
        System.out.println("");

    }
}

/**
 * We separate behaviors to their own interface, and have class implementations of that behavior.
 * Then when fighters want to use a certain behavior, they can be set within the ctor.
 *
 * ~~ Design Principle ~~
 * Identify the aspects of your application
 * that vary and separate them from what stays the same.
 *
 * ~~ OO Principles ~~
 * - Encapsulate what varies -> Jump and Roll Behavior
 * - Favor Composition over inheritance -> Forward/Backward Jump, Forward/Backward Roll
 * - Program to the interface, not the implementaion -> JumpBehavior jumpBehavior = new ForwardJump()
 *
 *  Finally, let's incorporate dynamic behavior changes.
 */