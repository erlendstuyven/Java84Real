package streamkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by BKERL on 29/12/2016.
 */
public class Kata9 {
    public static String namesToString(List<Person> collection) {
        return collection.stream().map(Person::getName).collect(Collectors.joining(", ", "Names: ", "."));
    }

}
