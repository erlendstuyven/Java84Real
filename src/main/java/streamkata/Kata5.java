package streamkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by BKERL on 28/12/2016.
 */
public class Kata5 {
    public static List<String> getKidNames(List<Person> persons) {
        return persons.stream().
                filter(value -> value.getAge() <= 18).
                map(Person::getName)
                .collect(Collectors.toList());
    }
}
