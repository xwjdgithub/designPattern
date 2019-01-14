package builderPattern.AbstractFactoryPattern;

/**
 * 抽象工厂模式，工厂中返回的是不同类型的对象
 */
public class AbstractFactory2 {
    public static void main(String[] args){
        IFactory2 factory1 = new Factory3();
        IFactory2 factory2 = new Factory4();
        factory1.produceMeizuPhone2().run();
        factory1.produceMeizuPhone3().run();
        factory2.produceMeizuPhone2().run();
        factory2.produceMeizuPhone3().run();
    }
}

//抽象产品接口1
interface MeizuPhone2{
    void run();
}

//具体产品
class X3 implements  MeizuPhone2{
    public void run(){
        System.out.println("我是一台X3");
    }
}
class X4 implements  MeizuPhone2{
    public void run(){
        System.out.println("我是一台X4");
    }
}

//抽象产品接口2
interface MeizuPhone3{
    void run();
}

//具体产品
class X5 implements  MeizuPhone3{
    public void run(){
        System.out.println("我是一台X5");
    }
}
class X6 implements  MeizuPhone3{
    public void run(){
        System.out.println("我是一台X6");
    }
}

//抽象工厂接口
interface IFactory2{
    MeizuPhone2 produceMeizuPhone2();
    MeizuPhone3 produceMeizuPhone3();
}

//具体的工厂
class Factory3 implements IFactory2{
    public MeizuPhone2 produceMeizuPhone2(){
        return new X3();
    }

    public MeizuPhone3 produceMeizuPhone3(){
        return new X5();
    }
}

class Factory4 implements IFactory2{
    public MeizuPhone2 produceMeizuPhone2(){
        return new X4();
    }

    public MeizuPhone3 produceMeizuPhone3(){
        return new X6();
    }
}