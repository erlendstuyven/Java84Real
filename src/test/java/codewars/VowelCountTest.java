package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelCountTest {

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
        assertEquals("Nope!", 5, VowelCount.getCount("aeiou"));
    }

}