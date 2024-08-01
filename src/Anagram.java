import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both char arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted char arrays
        return Arrays.equals(sArray, tArray);


    }
}
