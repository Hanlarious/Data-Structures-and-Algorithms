import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param str: A string
     * @return: A string
     */
    public String lowercaseToUppercase2(String str) {
        StringBuilder res = new StringBuilder(str);
        for(int i = 0; i < res.length(); i++) {
                char ch = res.charAt(i);
            if(Character.isLowerCase(ch)){
                res.setCharAt(i,Character.toUpperCase(ch));
            }

        } 
        return res.toString();
        }
    }
