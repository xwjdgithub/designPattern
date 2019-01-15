package builderPattern.singleton;

public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(null == instance){
            instance = new Singleton3();
        }
        return instance;
    }
}
