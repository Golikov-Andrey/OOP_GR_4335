
public class Person<T,V> {
    protected T firstName;
    protected T secondName;
    protected V age;

    /**
   * Конструктор класса 
   * @param firstName Имя
   * @param secondName Фамилия
   * @param age Возраст
   */
    public Person(T firstName, T secondName, V age) 
    {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
    }

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getSecondName() {
        return secondName;
    }

    public void setSecondName(T secondName) {
        this.secondName = secondName;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
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
