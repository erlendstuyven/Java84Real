package streamkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by BKERL on 29/12/2016.
 */
public class Kata8 {
    public static Map<String,List<Person>> groupByNationality(List<Person> collection) {
        return collection.stream().collect(Collectors.groupingBy(person -> person.getCountry()));
    }

}
