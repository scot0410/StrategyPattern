import java.lang.reflect.Method;

public class ChunLi extends Fighter implements JumpBehavior, SuperCombo{

    @Override
    void display(){
        Method[] methods = ChunLi.class.getDeclaredMethods();
        System.out.println("Here's what ChunLi can do:");
        System.out.println("-------------------------------------------");
        for(Method method : methods){
            System.out.print(method.getName());
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
    }

    @Override
    void kick(){
        System.out.println("~~~~~~~CHUNLI KICK~~~~~~~");
    }

    @Override
    void punch(){
        System.out.println("~~~~~~~CHUNLI PUNCH~~~~~~~");
    }

    @Override
    public void jump(){
        System.out.println("~~~~~~~CHUNLI JUMP~~~~~~~");
    }

    //We have to reimplement this method even though it performs the same task in Ryu...
    @Override
    public void superCombo(){
        jump();
        kick();
        punch();
    }
}