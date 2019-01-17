package actionPattern.visitorPattern;

public class APPOwner implements Visitor{
    public void visit(User user){
        System.out.println("User");
    }
    public void visit(UserOrdinary user){
        System.out.println("UserOrdinary");
    }
    public void visit(UserVIP user){
        System.out.println("UserVIP");
    }
}
