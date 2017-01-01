package codewars;

/**
 * Created by BKERL on 31/12/2016.
 */
public class DigitalRoot {

    public static int digital_root(int incomingNumber) {
        int root = 0;
        root = calculateRoot(incomingNumber, root);
        root = recalculateRootWhenGreaterThan10(root);
        return  root;
    }

    private static int calculateRoot(int incomingNumber, int root) {
        for (char digit : getChars(incomingNumber)) {
            root = root + Integer.parseInt(Character.toString(digit));
        }
        return root;
    }

    private static int recalculateRootWhenGreaterThan10(int root) {
        if (root > 10) {
            return digital_root(root);
        }
        return root;
    }

    private static char[] getChars(int n) {
        String numberAsString = String.valueOf(n);
        return numberAsString.toCharArray();
    }
}