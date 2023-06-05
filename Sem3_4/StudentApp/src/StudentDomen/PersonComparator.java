package StudentDomen;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if(resultComparing == 0)
        {
            resultComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultComparing;
        }
        else{
            return resultComparing;
        }       
    }    
}
