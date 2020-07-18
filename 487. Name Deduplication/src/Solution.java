import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public List<String> nameDeduplication(String[] names) {
        List<String> result = new ArrayList<String>();
        HashMap<String,Integer> hash = new HashMap<>();
        for (int i = 0; i < names.length; i++){
            String str = names[i].toLowerCase();
            if(!hash.containsKey(str)){
                hash.put(str,1);
                result.add(str);
            }

        }
            return result;
    }
}
