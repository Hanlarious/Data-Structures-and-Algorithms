public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        if (s == null || s.isEmpty()) {
            return true;
        }

        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ch1 = s.charAt(i);
            if(!Character.isLetterOrDigit(ch1)){
                i++;
                continue;
            }

            char ch2 = s.charAt(j);
            if(!Character.isLetterOrDigit(ch2)){
                j--;
                continue;
            }

            if (ch1 != ch2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}