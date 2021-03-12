public class StrategyPattern{
    public static void main(String[] args){
        System.out.println("");
        System.out.println("~~~ Fight!! ~~~");
        System.out.println("Here's the fighter's moves: ");

        Fighter fighter = new Fighter();
        Fighter chunLi = new ChunLi();
        Fighter ryu = new Ryu();
        Fighter ken = new Ken();

        fighter.display();
        chunLi.display();
        ryu.display();
        ken.display();

        System.out.println("");
        System.out.println("Ryu makes the first move...");
        ryu.performJump();

        System.out.println("Ken moves back to avoid damage...");
        ken.performJump();

        System.out.println("Ryu performs his special jump attack, his oppenent didn't see it coming...");
        ryu.setJumpBehavior(new Shouryuken()); //< -- we changed the the JumpBehavior dynamically with the setter
        ryu.performJump(); //<-- this jump move is different than it was before..

        System.out.println("Shockingly!! Ken can do the same special jump attack move...");
        ken.setJumpBehavior(new Shouryuken());
        ken.performJump();

        System.out.println("");
        System.out.println("!!! The fight ensues dynamically !!!");
        System.out.println("");

    }
}

/**
 * We use setters to change the behavior dynamically... :)
 */