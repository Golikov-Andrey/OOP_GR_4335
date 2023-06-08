

public class Student<T extends Comparable<T>,V> extends Person<T,V> implements Comparable<Student<T,V>>{
    V id;
  
    public Student(T firstName, T secondName, V age, V id) {
      super(firstName, secondName, age);
      this.id = id;
    }
  
    /**
     * @return id
     */
    public V getId() {
      return id;
    }
  
    /**
     * @param id присваевает уник. номер
     */
    public void setId(V id) {
      this.id = id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student<T,V> o) {
        return super.firstName.compareTo(o.firstName);
    }
  }
