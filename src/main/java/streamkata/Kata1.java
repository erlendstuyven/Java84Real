package streamkata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by BKERL on 27/12/2016.
 */
public class Kata1 {
    public static List transform(List<String> collection) {
        Stream<String> stream = collection.stream();
        return stream.filter(v -> v.length() < 4).collect(toList());
    }
}
