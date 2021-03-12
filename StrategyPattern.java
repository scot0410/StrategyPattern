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

        System.out.println("ChunLi and Ryu's Super Combo Gauge is full!!! ");
        System.out.println("ChunLi does her Super Move!! ");
        chunLi.superCombo();

        System.out.println("Ryu must counter with his last strength...");
        ryu.superCombo();

        System.out.println("They both did the same move, but with different implementations.. ");
    }
}

/**
 *
 */