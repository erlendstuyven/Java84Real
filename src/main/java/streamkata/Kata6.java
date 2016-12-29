package streamkata;


import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by BKERL on 28/12/2016.
 */
public class Kata6 {
    public static IntSummaryStatistics getStats(List<Person> persons) {
        return persons.stream().mapToInt(Person::getAge).summaryStatistics();
    }
}
