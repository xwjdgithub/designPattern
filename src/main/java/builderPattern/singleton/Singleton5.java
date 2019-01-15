package builderPattern.singleton;

public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5(){}

    public static Singleton5 getInstance(){
        if(null == instance){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
