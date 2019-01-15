package builderPattern;

public class Prototype implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] agrs){
        Prototype pro1 = new Prototype();
        pro1.setName("aaaa");
        Prototype pro2 = (Prototype)pro1.clone();
        System.out.println("结束");
    }
}
