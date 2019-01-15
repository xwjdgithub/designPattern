package builderPattern.singleton;

/**
 * 静态常量，类加载时即实例化，能解决线程同步的问题
 * 但是不能懒加载，如果这个类自始至终没有使用过，会造成内存浪费
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){};

    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
