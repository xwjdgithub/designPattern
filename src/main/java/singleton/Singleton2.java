package singleton;

public class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2(){}

    public Singleton2 getInstance(){
        return instance;
    }

}
