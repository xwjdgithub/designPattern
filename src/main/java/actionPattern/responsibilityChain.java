package actionPattern;

/**
 * 责任链模式
 * 向链路中随便一个对象提交处理请求，都能流转到正确的处理节点
 * 整数n，n<0，则返回绝对值；0<=n<10，则返回n*n；若n><10，则返回n
 */
public class responsibilityChain {
    public static void main(String[] args){
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler1);

        System.out.println("提交给handler1：" + handler1.handleRequest(-2));
        System.out.println("提交给handler1：" + handler1.handleRequest(5));
        System.out.println("提交给handler1：" + handler1.handleRequest(20));

        System.out.println("提交给handler2：" + handler2.handleRequest(-2));
        System.out.println("提交给handler2：" + handler2.handleRequest(5));
        System.out.println("提交给handler2：" + handler2.handleRequest(20));

        System.out.println("提交给handler3：" + handler3.handleRequest(-2));
        System.out.println("提交给handler3：" + handler3.handleRequest(5));
        System.out.println("提交给handler3：" + handler3.handleRequest(20));
    }

}

//处理者
interface Handler{
    int handleRequest(int n);
    void setNextHandler(Handler handler);
}

class Handler1 implements Handler{
    private Handler next;

    public int handleRequest(int n){
        if(n < 0){
            return -n;
        }else {
            return next.handleRequest(n);
        }
    }

    public void setNextHandler(Handler handler){
        this.next = handler;
    }
}

class Handler2 implements Handler{
    private Handler next;

    public int handleRequest(int n){
        if(0 <= n && n < 10){
            return n*n;
        }else {
            return next.handleRequest(n);
        }
    }

    public void setNextHandler(Handler handler){
        this.next = handler;
    }
}

class Handler3 implements Handler{
    private Handler next;

    public int handleRequest(int n){
        if(n >= 10){
            return n;
        }else {
            return next.handleRequest(n);
        }
    }

    public void setNextHandler(Handler handler){
        this.next = handler;
    }
}