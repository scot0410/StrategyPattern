public class StrategyPattern{
    public static void main(String[] args){
        System.out.println("~~~ Fight!! ~~~");

        Fighter fighter = new Fighter();
        fighter.display();

        ChunLi chunLi = new ChunLi();
        chunLi.display();

        System.out.println("ChunLi makes his first move...");
        chunLi.roll();
        System.out.println("...ChunLi shouldn't be able to do that");
        System.out.println("");
    }
}