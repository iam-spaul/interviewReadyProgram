public class S3 {
    public static void main(String[] args) {
        String num="4206";
        String ans=largestOddNumber(num);
        System.out.println(ans);
    }
    public static String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current character is an odd digit
            char c = num.charAt(i);
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                // Return the substring from the start to the current character (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // Return an empty string if no odd digit is found
        return "";


    }
}
