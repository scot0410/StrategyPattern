import java.lang.reflect.Method;

public class Ryu extends Fighter implements JumpBehavior{
    void display(){
        Method[] methods = Ryu.class.getDeclaredMethods();
        System.out.println("Here's what Ryu can do:");
        System.out.println("----------------------");
        for(Method method : methods){
            System.out.print(method.getName());
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println("----------------------");
    }

    void kick(){
        System.out.println("~~~~~~~RYU FAKE-OUT HADOKEN KICK~~~~~~~");
    }

    //We have to reimplement this method even though it performs the same task in Ryu...
    @Override
    public void jump(){
        System.out.println("~~~~~~~JUMP~~~~~~~");
    }


}