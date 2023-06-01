package StudentDomen;

public class Emploee extends Person{
    private String special;
    public Emploee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }
}
