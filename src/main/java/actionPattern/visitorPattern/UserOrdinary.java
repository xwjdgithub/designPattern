package actionPattern.visitorPattern;

public class UserOrdinary implements User{
    private String name;
    public UserOrdinary(String name){
        this.name = name;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
