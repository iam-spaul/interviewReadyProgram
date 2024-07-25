import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String s="Subhankar";
        String ans=Rev(s);
        System.out.println(ans);
    }
    public static String Rev(String s){
        String ch="";
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i)+ch;
        }
        return ch;
    }
}
