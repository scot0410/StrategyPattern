import java.lang.reflect.Method;

public class Fighter{

    void display(){
        Method[] methods = Fighter.class.getDeclaredMethods();
        System.out.println("Here's what a fighter can do:");
        System.out.println("------------------");
        for(Method method : methods){
                System.out.println(method.getName());
            }
        System.out.println("------------------");

    }
    void kick(){
        System.out.println("~~~~~~~FIGHTER KICK~~~~~~~");
    }
    void punch(){
        System.out.println("~~~~~~~FIGHTER PUNCH~~~~~~~");
    }
}