import java.lang.reflect.Method;

public class ChunLi extends Fighter{

    public ChunLi(){
        this.jumpBehavior = new ForwardJump();
        this.rollBehavior = new BackwardRoll();
    }

    void display(){
        Method[] methods = ChunLi.class.getDeclaredMethods();
        System.out.println("Here's what ChunLi can do:");
        System.out.println("-----------------------");
        for(Method method : methods){
            System.out.print(method.getName());
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println("-----------------------");
    }

    //These moves are unique to Chun-li
    void kick(){
        System.out.println("~~~~~~~CHUN-LI LIGHTING KICK~~~~~~~");
    }

    void punch(){
        System.out.println("~~~~~~~CHUN-LI KIKOKEN PUNCH~~~~~~~");
    }

}