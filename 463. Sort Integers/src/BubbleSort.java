public class BubbleSort {
    public void sortIntegers(int[] A) {

        for (int i = 0; i < A.length - 1; i++){
            for(int j = i+1; j < A.length; j++){
                if (A[j] < A[i]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }

        }


    }
}
