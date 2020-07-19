import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = {0,0};
        for(int i=0;i<numbers.length;i++){

            if(map.get(numbers[i])!=null){
                int[] res = {map.get(numbers[i]),i};
                return res;
            }
            map.put(target-numbers[i],i);
        }
        return result;
    }
}