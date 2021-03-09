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
        System.out.println("KICK!!");
    }
    void punch(){
        System.out.println("~~~~~~~FIGTER PUNCH~~~~~~~");
    }
    void jump(){
        System.out.println("~~~~~~~FIGTER JUMP~~~~~~~");
    }
    void roll(){
        System.out.println("~~~~~~~FIGTER ROLL~~~~~~~");
    }
}