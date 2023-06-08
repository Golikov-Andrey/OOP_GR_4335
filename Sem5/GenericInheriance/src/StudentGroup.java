

import java.util.Iterator;
import java.util.List;

public class StudentGroup<T extends Comparable<T>,V> implements Iterable<Student<T,V>> {
    List<Student<T,V>> group;
    private V idGroup;

    public StudentGroup(List<Student<T,V>> group, V idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student<T,V>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<T,V>> group) {
        this.group = group;
    }

    public V getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(V idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student<T,V>> iterator() {

        return new Iterator<Student<T,V>>()
        {
            private int counter;
       
            @Override
            public boolean hasNext() {
                return counter<group.size();
            }
        
            @Override
            public Student<T,V> next() {
                if(!hasNext())
                {
                    return null;
                }
                return group.get(counter++);
            }
        };

        //return new SGIterator(group);
    }


}
