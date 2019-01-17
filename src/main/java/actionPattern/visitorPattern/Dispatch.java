package actionPattern.visitorPattern;

public class Dispatch {
    public void print(Father father){
        System.out.println("父类");
    }

    public void print(Child child){
        System.out.println("子类");
    }

    public static void main(String[] args){
        Father child = new Child();
        new Dispatch().print(child);//输出“父类”，因为重载是根据静态类型进行的（编译时即分配）
        child.print();//输出“子类”，因为重写是根据实际类型进行的（运行是动态分配）
    }
}

class Father{
    void print(){
        System.out.println("父类");
    }
}

class Child extends Father{
    void print(){
        System.out.println("子类");
    }
}