public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] inp= {"flower","flow","flight"};
        String ans=longestCommonPrefix(inp);
        System.out.println(ans);
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String ans="";

        for (int i = 0; i < strs[0].length(); i++) {
            char ch=strs[0].charAt(i);
            boolean match = true;

            for (int j = 1; j < strs.length ; j++) {
                if ( ch!=strs[j].charAt(i)){
                    match=false;
                    break;
                }

            }

            if (match==false){
                break;
            }
            else {
                ans+=ch;
            }
        }
        return ans;

    }
}
