package builderPattern;


public class FactoryMethod {
    public static void main(String[] args) throws Exception{
        Factory factory = new Factory();
        factory.produce("PRO5").run();
        factory.produce("PRO6").run();
    }
}

//抽象产品接口
interface MeizuPhone{
    void run();
}

//具体产品
class PRO5 implements MeizuPhone{
    public void run(){
        System.out.println("我是一台PRO5");
    }
}
class PRO6 implements MeizuPhone{
    public void run(){
        System.out.println("我是一台PRO6");
    }
}

//工厂
class Factory{
    public MeizuPhone produce(String product) throws Exception{
        if(product.equals("PRO5")){
            return new PRO5();
        }else if(product.equals("PRO6")){
            return new PRO6();
        }else {
            throw new Exception("no such class");
        }
    }

}