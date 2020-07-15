import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param num: An integer
     * @return: an integer array
     */


    public List<Integer> primeFactorization(int num) {
        List<Integer> factors = new ArrayList<Integer>();
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                factors.add(i);
            }
        } 
        return res;
    }
}