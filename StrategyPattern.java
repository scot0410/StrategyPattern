public class StrategyPattern{
    public static void main(String[] args){
        System.out.println("~~~ Fight!! ~~~");
        System.out.println("Here's the fighter's moves: ");

        Fighter fighter = new Fighter();
        Fighter chunLi = new ChunLi();
        Fighter ryu = new Ryu();

        //to print each display on one line..
//        System.out.print(fighter.display());
//        System.out.print(chunLi.display());
//        System.out.print(ryu.display());



        fighter.display();
        chunLi.display();
        ryu.display();

        System.out.println("Chun-li makes the first move...");
        chunLi.performJump();
        ryu.performJump();

        chunLi.performRoll();
        ryu.performRoll();
    }
}

/**
 * We separate behaviors to their own interface, and have classes inherit the behavior they'll use.
 *
 * ~~ Design Principle ~~
 * Identify the aspects of your application
 * that vary and separate them from what stays the same.
 *
 */