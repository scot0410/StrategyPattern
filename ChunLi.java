import java.lang.reflect.Method;

public class ChunLi extends Fighter{

    @Override
    void displayActions(){
        Method[] methods = ChunLi.class.getDeclaredMethods();
        System.out.println("Here's what ChunLi can do:");
        System.out.println("------------------");
        for(Method method : methods){
            System.out.println(method.getName());
        }
        System.out.println("------------------");

    }

    @Override
    void display(){
        System.out.println("~~ChunLi~~");
    }

    @Override
    void kick(){
        System.out.println("ChunLi KICK!!");
    }

    @Override
    void jump(){
        System.out.println("ChunLi JUMP");
    }
}