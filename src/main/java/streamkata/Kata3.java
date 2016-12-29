package streamkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by BKERL on 28/12/2016.
 */
public class Kata3 {
    public static Person getOldestPerson(List<Person> persons) {
        return persons.stream().max((value1, value2) -> Integer.compare(value1.getAge(),value2.getAge())).get();
    }
}
