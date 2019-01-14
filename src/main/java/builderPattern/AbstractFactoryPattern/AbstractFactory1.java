package builderPattern.AbstractFactoryPattern;

/**
 * 抽象工厂模式，工厂中返回的是同一类型的对象
 */

public class AbstractFactory1 {
    public static void main(String[] args){
        IFactory1 factory1 = new Factory1();
        IFactory1 factory2 = new Factory2();
        factory1.produce().run();
        factory2.produce().run();
    }
}

//抽象产品接口
interface MeizuPhone1{
    void run();
}

//具体产品
class X1 implements  MeizuPhone1{
    public void run(){
        System.out.println("我是一台X1");
    }
}
class X2 implements  MeizuPhone1{
    public void run(){
        System.out.println("我是一台X2");
    }
}

//抽象工厂接口
interface IFactory1{
    MeizuPhone1 produce();
}

//具体的工厂
class Factory1 implements  IFactory1{
    public MeizuPhone1 produce(){
        return new X1();
    }
}

class Factory2 implements  IFactory1{
    public MeizuPhone1 produce(){
        return new X2();
    }
}