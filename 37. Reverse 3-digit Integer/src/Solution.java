public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        int a = number%10;
        int b = number/10%10;
        int c = number/100%10;
        int res = (a*100 + b*10 + c);
        return res;

    }
}