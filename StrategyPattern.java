public class StrategyPattern{
    public static void main(String[] args){
        System.out.println("");
        System.out.println("~~~ Fight!! ~~~");

        Fighter fighter = new Fighter();
        fighter.display();

        ChunLi chunLi = new ChunLi();
        chunLi.display();

        Ryu ryu = new Ryu();
        ryu.display();

        System.out.println("");
        System.out.println("ChunLi makes her first move...");
        chunLi.punch();

        System.out.println("Ryu counters...");
        ryu.kick();

        System.out.println("Chun-Li narrowly avoids the attack!! ");
        chunLi.jump();

        System.out.println("Ryu jumps as he approaches to attack...");
        ryu.jump();

        System.out.println("");
        System.out.println("They both did the same jump move, but with different implementations.. ");
        System.out.println("");
    }
}

/**
 * Using inheritance requires us to override and reimplement the same behavior.
 */