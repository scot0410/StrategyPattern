import java.lang.reflect.Method;

public class ChunLi extends Fighter{
    /**
     * ~~ Design Principle ~~
     * Program to the interface, not the implementaion
     *  Interface is JumpBehavior (referenced in Fighter.java)
     *  Implementation is ForwardRoll
     *  ForwardJump forwardJump = new ForwardJump();   <-- X
     *  JumpBehavior jumpBehavior = new ForwardJump(); <-- ✔
     *   ^ This allows us to change the jumpBehavior to BackwardJump when we want that behavior
     *
     */
    public ChunLi(){
        this.jumpBehavior = new BackwardJump();
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