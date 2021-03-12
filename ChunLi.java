import java.lang.reflect.Method;

public class ChunLi extends Fighter{

    @Override
    void display(){
        Method[] methods = ChunLi.class.getDeclaredMethods();
        System.out.println("Here's what Chun-Li can do:");
        System.out.println("----------------------");
        for(Method method : methods){
            System.out.print(method.getName());
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println("----------------------");

    }

    @Override
    void kick(){
        System.out.println("~~~~~~~CHUN-LI KICK~~~~~~~");
    }

    @Override
    void punch(){
        System.out.println("~~~~~~~CHUN-LI PUNCH~~~~~~~");
    }
}