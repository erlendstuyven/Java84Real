package streamkata;

        import org.junit.Test;

        import java.util.List;
        import java.util.Map;

        import static java.util.Arrays.asList;
        import static org.assertj.core.api.Assertions.assertThat;

/*
Group people by nationality
 */
public class Kata8Test {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = Kata8.groupByNationality(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
    }

}