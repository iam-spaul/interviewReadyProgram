public class UpperToLower {
    public static void main(String[] args) {
        String s="ACCCbbc";
        String ans=convert(s);
        System.out.println(ans);
    }

    public  static String convert(String s){
        int upperCaseCount=0;
        int lowerCaseCount=0;
//        for(char ch=s.toCharArray()){
//            if (ch==)
//        }
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>=65 && s.charAt(i)<=90){
                upperCaseCount++;
            }
            if (s.charAt(i)>=97 && s.charAt(i)<=122){
                lowerCaseCount++;
            }
        }
        if (upperCaseCount<lowerCaseCount){
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)>=65 && s.charAt(i)<=90){
                    ans+=(char)(s.charAt(i)+32);
                }
                else{
                    ans+=(char)(s.charAt(i));
                }
            }
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)>=97 && s.charAt(i)<=122){
                    ans+=(char)(s.charAt(i)-32);
                }
                else {
                    ans+=s.charAt(i);
                }
            }
        }
        return ans;
    }
}
