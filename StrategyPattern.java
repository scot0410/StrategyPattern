public class StrategyPattern{
    public static void main(String[] args){
        System.out.println("~~~ Fight!! ~~~");

        Fighter fighter = new Fighter();
        fighter.displayActions();

        ChunLi chunLi = new ChunLi();
        chunLi.displayActions();

        System.out.println("ChunLi makes his first move...");
        chunLi.punch();
        System.out.println("...ChunLi shouldn't be able to do that");

    }
}