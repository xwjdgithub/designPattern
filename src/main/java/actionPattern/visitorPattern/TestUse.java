package actionPattern.visitorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class TestUse {
    public static void main(String[] args){
        Visitor visitor = new APPOwner();
        ArrayList<User> users = new ArrayList<User>();
        users.add(new UserOrdinary("第一个普通用户"));
        users.add(new UserOrdinary("第二个普通用户"));
        users.add(new UserVIP("第一个VIP用户"));
        Iterator<User> iterator = users.iterator();
        while (((Iterator) iterator).hasNext()){
            User user = iterator.next();
            visitor.visit(user);//一直输出“User”，Vistitor中重载的的方法，只能更加静态类型判断要调用哪一个，编译时确定
            user.accept(visitor);//输出User的实际类型，User个子类中重写的方法，根据实际类型，运行时动态分配
            System.out.println("=============");
        }
    }
}
