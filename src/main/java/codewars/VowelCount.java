package codewars;

import javax.xml.stream.events.Characters;

/**
 * Created by BKERL on 31/12/2016.
 */
public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'i' || c == 'o' || c =='i') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
