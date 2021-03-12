public class StrategyPattern{
    public static void main(String[] args){
        System.out.println("");
        System.out.println("~~~ Fight!! ~~~");

        Fighter fighter = new Fighter();
        fighter.display();

        ChunLi chunLi = new ChunLi();
        chunLi.display();
        System.out.println("");

        System.out.println("Chun-Li makes her first move...");
        chunLi.roll();
        System.out.println("...Chun-Li shouldn't be able to do that");
        System.out.println("");
    }

    /**
     * When we extend a class, we bring all its methods along with it.
     * Trying again, but with inheritance...
     */
}