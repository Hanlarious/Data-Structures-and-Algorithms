public class Solution {
    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */
    public int reverseInteger(int n) {
        int reversed = 0;
        while(n != 0){
            int temp = reversed * 10 + n % 10;
            n = n/10;
            if (temp / 10 != reversed){
                reversed = 0;
                break;
            }
            reversed = temp;
        }
        return reversed;
        }
    }

