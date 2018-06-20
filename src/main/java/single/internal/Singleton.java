package single.internal;


/**
 * 静态内部类实现
 */
public class Singleton {
    private Singleton(){}
    
    static {
        System.out.println("This's static code block!");
    }
    
    private static class SingletonHandler {
        private static Singleton singleton = new Singleton();
        static {
            System.out.println("This's innerClass's static code block");
        }
    }
    
    public static Singleton getInstance(){
        return SingletonHandler.singleton;
    }
    
    public static void display(){
        System.out.println("This's display!");
    }
}