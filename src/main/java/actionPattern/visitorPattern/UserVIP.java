package actionPattern.visitorPattern;

public class UserVIP implements User{
    private String name;
    public UserVIP(String name){
        this.name = name;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
