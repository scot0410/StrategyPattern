import java.lang.reflect.Method;

public class ChunLi extends Fighter{

    @Override
    void display(){
        Method[] methods = ChunLi.class.getDeclaredMethods();
        System.out.println("Here's what ChunLi can do:");
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
        System.out.println("~~~~~~~CHUNLI KICK~~~~~~~");
    }

    @Override
    void punch(){
        System.out.println("~~~~~~~CHUNLI PUNCH~~~~~~~");
    }
}