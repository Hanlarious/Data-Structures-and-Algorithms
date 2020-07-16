import java.util.List;

public class Solution {
    /*
     * @param k: An integer
     * @return: all amicable pairs
     */
    public int sumOfFactors(int n){
        int sum = 1, i;
        for (i = 2; i * i < n; i++){
            if(n %  i == 0){
                sum += i + n / i;
            }
        }
        if (i * i == n){
            sum += i;
        }
        return sum;
    }

    public List<List<Integer>> amicablePair(int k) {

    }
}