package streamkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by BKERL on 29/12/2016.
 */
public class Kata7 {
    public static Map<Boolean,List<Person>> partitionAdults(List<Person> collection) {
        return collection.stream().collect(Collectors.partitioningBy(person -> person.getAge() > 18));
    }
}
