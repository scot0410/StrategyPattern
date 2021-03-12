import java.lang.reflect.Method;

public class ChunLi extends Fighter implements JumpBehavior{

    @Override
    void display(){
        Method[] methods = ChunLi.class.getDeclaredMethods();
        System.out.println("Here's what Chun-Li can do:");
        System.out.println("------------------------------");
        for(Method method : methods){
            System.out.print(method.getName());
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println("------------------------------");
    }

    void kick(){
        System.out.println("~~~~~~~CHUN-LI LIGHTING KICK~~~~~~~");
    }

    void punch(){
        System.out.println("~~~~~~~CHUN-LI KIKOKEN PUNCH~~~~~~~");
    }

    //We have to reimplement this method even though it performs the same task in Ryu...
    @Override
    public void jump(){
            System.out.println("~~~~~~~JUMP~~~~~~~");
    }
}