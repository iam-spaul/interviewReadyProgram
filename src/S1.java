import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class S1 {

    public static void main(String[] args) {
            String s="hello world";
          String ans=  reverseWords(s);
        System.out.println(ans);

    }

        public String removeOuterParentheses(String s) {
            int open=0;
            StringBuilder res=new StringBuilder();

            for(char c :s.toCharArray()){
                if (c=='('){
                    if (open>0){
                        res.append(c);
                    }
                    open++;
                }
                else{
                    open--;
                    if (c==')'){
                        res.append(c);

                    }
                }
            }
            return res.toString();
        }

    public static String reverseWords(String s) {

        Stack<String>st=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            String word="";
            while (i < s.length() && s.charAt(i) != ' '){
                word+=s.charAt(i);
                i++;
            }

            if (!word.isEmpty()) {
                st.push(word);
            }
        }
        String ans="";
        while (!st.empty()){
            ans=ans+st.peek();
            st.pop();
            if (!st.empty()) {
                ans += " ";
            }

        }

        return ans;
    }

}
