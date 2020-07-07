import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> generate(int size) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 1; i <= size; i ++){
            res.add(i);
        }
        return res;
    }
}
