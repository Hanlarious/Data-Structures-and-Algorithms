import java.util.Arrays;

public class Alternative {

    public int[] twoSum(int[] numbers, int target) {
        int[] backUp = new int[numbers.length];
        System.arraycopy(numbers, 0, backUp, 0, numbers.length);
        Arrays.sort(numbers);
        int i = 0,j = numbers.length-1;
        while (i < j) {
            // 找到答案
            if (numbers[i] + numbers [j] == target){
                break;
            }
            // 左指针右移
            else if (numbers[i] + numbers [j] < target){
                i += 1;
            }
            // 右指针左移
            else {
                j -= 1;
            }
        }
        int a = 0,b = 0;// 标记是否找到，避免i，j值相同的情况
        for (int k = 0; k < numbers.length; k++) {
            //查找对应下标
            if (backUp[k] == numbers[i] && a == 0) {
                i = k;
                a = 1;
            }
            else if (backUp[k] == numbers[j] && b == 0) {
                j = k;
                b = 1;
            }
            else if (a == 1 && b == 1) {
                break;
            }
        }
        int[] ans = new int[2];
        ans[0] = i;
        ans[1] = j;
        Arrays.sort(ans);
        return ans;

    }
}


