import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();
       for(String str : strs){
        char [] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String newString = new String(charArray);
        map.putIfAbsent(newString, new ArrayList<>());
        map.get(newString).add(str);
       }
        
       return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String []strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(new GroupAnagram().groupAnagrams(strs).toString());
    }
    
}
