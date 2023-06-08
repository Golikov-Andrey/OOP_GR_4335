package Model;

public class Teacher extends Person{
    private String acadDegree;
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
}
