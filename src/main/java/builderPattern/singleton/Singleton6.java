package builderPattern.singleton;

public class Singleton6 {
    private static Singleton6 instacne;

    private Singleton6(){}

    public static Singleton6 getInstance(){
        if(null == instacne){
            synchronized (Singleton6.class){
                if(null == instacne){
                    instacne = new Singleton6();
                }
            }
        }
        return instacne;
    }
}
