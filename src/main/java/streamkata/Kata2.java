package streamkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by BKERL on 27/12/2016.
 */
class Kata2 {

    static List<String> transform(List<List<String>> collection) {
        return collection.stream().flatMap(value -> value.stream()).collect(Collectors.toList());
    }
}
