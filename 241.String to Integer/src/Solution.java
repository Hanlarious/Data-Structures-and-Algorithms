public class Solution {
    /**
     * @param str: A string
     * @return: An integer
     */
    public int stringToInteger(String str) {
        if(str == null || str.isEmpty()){
            return 0;
        }
        boolean isNegative = str.charAt(0) == '-';
        int start = isNegative? 1:0;
        int res = 0;

        for(int i = start; i < str.length(); i++){
            char ch = str.charAt(i);
            int digit = ch - '0';
            if (!isNegative){
                res = res*10 + digit;
            }
            else {
                res = res*10 - digit;
            }
        }
        return res;
    }
}
