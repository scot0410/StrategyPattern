import java.lang.reflect.Method;

public class Ken extends Fighter{

    public Ken(){
        //It appears Ken can only roll/jump backwards...
        this.rollBehavior = new BackwardRoll();
        this.jumpBehavior = new BackwardJump();
    }
    void display(){
        Method[] methods = Ken.class.getDeclaredMethods();
        System.out.println("Here's what Ken can do:");
        System.out.println("--------");
        for(Method method : methods){
            System.out.print(method.getName());
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println("--------");
    }
}