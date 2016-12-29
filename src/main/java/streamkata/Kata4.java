package streamkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by BKERL on 28/12/2016.
 */
public class Kata4 {
    public static int calculate(List<Integer> numbers) {
        return numbers.stream().reduce(Integer::sum).get();
    }
}
