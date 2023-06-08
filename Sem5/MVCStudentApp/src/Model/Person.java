package Model;

public class Person {
    protected String firstName;
    protected String secondName;
    protected int age;

    /**
   * Конструктор класса 
   * @param firstName Имя
   * @param secondName Фамилия
   * @param age Возраст
   */
    public Person(String firstName, String secondName, int age) 
    {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
