package Controllers;

import Services.EmploeeService;
import StudentDomen.Emploee;
import StudentDomen.Person;

public class EmploeeController implements iPersonController<Emploee> {

    private final EmploeeService empServ = new EmploeeService();
    
    @Override
    public void create(String firstName, String secondName, int age) {
        empServ.create(firstName, secondName, age);
    }

    static public <T extends Emploee> void paySalary(T person)
    {
        System.out.println((person).getFirstName() + " выплачена зарплата 10000р.");
        //return person;
    }
    
}
