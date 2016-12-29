package streamkata;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;


/*
Sum all elements of a collection
 */
public class Kata4Test {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Assertions.assertThat(Kata4.calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}