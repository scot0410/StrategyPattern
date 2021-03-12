import java.lang.reflect.Method;

public class ChunLi extends Fighter{

    public ChunLi(){
        jumpBehavior = new ForwardJump();
        rollBehavior = new BackwardRoll();
    }

    @Override
    void display(){
        Method[] methods = ChunLi.class.getDeclaredMethods();
        System.out.println("Here's what ChunLi can do:");
        System.out.println(" -----------------------");
        for(Method method : methods){
            System.out.print(method.getName());
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println(" -----------------------");
    }

    //These moves are unique to Chun-li
    void kick(){
        System.out.println("~~~~~~~CHUN-LI LIGHTING KICK~~~~~~~");
    }

    void punch(){
        System.out.println("~~~~~~~CHUN-LI KIKOKEN PUNCH~~~~~~~");
    }

//    //We have to reimplement this method even though it performs the same task in Ryu...
//    @Override
//    public void superCombo(){
//        jump();
//        kick();
//        punch();
//    }
}