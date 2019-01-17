package actionPattern.visitorPattern;

public interface Visitor {
    void visit(User user);
    void visit(UserOrdinary user);
    void visit(UserVIP user);
}
