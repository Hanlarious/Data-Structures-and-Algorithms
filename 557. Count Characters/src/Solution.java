import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> res = new HashMap<>();
        for(char c : str.toCharArray()){
            if (!res.containsKey(c)){
                res.put(c, 1);
            }
            else{
                res.put(c, res.get(c) + 1);
            }
        }
        return res;
    }
}
