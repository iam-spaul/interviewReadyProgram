public class UpperToLower {
    public static void main(String[] args) {
        String s="ACCCbb";
        String ans=convert(s);
        System.out.println(ans);
    }

    public  static String convert(String s){
        int upperCaseCount=0;
        int lowerCaseCount=0;

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

            ans=s.toLowerCase();
        }
        else {
            ans=s.toUpperCase();
        }

        return ans;
    }
}
