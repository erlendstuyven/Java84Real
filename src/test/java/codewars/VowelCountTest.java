package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by BKERL on 31/12/2016.
 */
public class VowelCountTest {

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
        assertEquals("Nope!", 1, VowelCount.getCount("a"));
    }

}