package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by BKERL on 31/12/2016.
 */
public class PokerHand {
    public static boolean IsStraight(List<Integer> hand) {
        Collections.sort(hand);
        List<Integer> handWhereAcesAreReplacedByOnes = replaceAcesByOnes(hand);
        return isStraight(hand) || isStraight(handWhereAcesAreReplacedByOnes);
    }

    private static List<Integer> replaceAcesByOnes(List<Integer> hand) {
        List<Integer> handWhereAcesAreReplacedByOnes = new ArrayList<>();
        if (containsAnAce(hand)){
            handWhereAcesAreReplacedByOnes = hand.stream().map(integer -> {
                if (integer == 14) {
                    return 1;
                } else {
                    return integer;
                }
            }).collect(Collectors.toList());
            Collections.sort(handWhereAcesAreReplacedByOnes);
        }
        return handWhereAcesAreReplacedByOnes;
    }

    private static boolean containsAnAce(List<Integer> hand) {
        long aceCount = hand.stream().filter(integer -> integer == 14).count();
        return (aceCount >= 1);
    }

    private static boolean isStraight(List<Integer> hand) {
        boolean isStraight = false;
        int straightCounter = 1;
        for (int i = 0; i < hand.size(); i++) {
            Integer integer =  hand.get(i);
            if (i>0) {
                if ((integer == hand.get(i-1) + 1) || (integer == hand.get(i-1))){
                    straightCounter++;
                } else {
                    straightCounter=1;
                }
                if (straightCounter == 5) {
                    isStraight = true;
                }
            }
        }
        return isStraight;
    }
}
