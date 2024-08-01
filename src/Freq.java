import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Freq {
    public static void main(String[] args) {

    }
    public static String frequencySort(String s) {
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer>map=new HashMap<>();
        for (char ch:s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character>list=new ArrayList<>(map.keySet());
        list.sort((ob1,ob2)->map.get(ob2)-map.get(ob1));

        for(char ch:list){
            for (int i = 0; i < map.get(ch); i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
