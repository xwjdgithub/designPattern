package builderPattern;

public class Builder {

    public static void main(String[] agrs){
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setAge(10);
        studentBuilder.setNmae("jjjkki");
        Student student = new Student(studentBuilder);
        System.out.println("创建完成");
    }
}

class Student{
    String nmae = null;
    int number = -1;
    String sex = null;
    int age = -1;
    String school = null;

    public Student(StudentBuilder studentBuilder){
        this.age = studentBuilder.age;
        this.nmae = studentBuilder.nmae;
        this.number = studentBuilder.number;
        this.school = studentBuilder.school;
        this.sex =studentBuilder.sex;
    }

}

class StudentBuilder{
    String nmae = null;
    int number = -1;
    String sex = null;
    int age = -1;
    String school = null;

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student build(){
        return new Student(this);
    }
}