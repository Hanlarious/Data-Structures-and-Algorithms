public class SelectionSort {
    public void sortIntegers(int[] A) {
        int temp;
        int minIndex;
        for (int i = 0; i < A.length - 1; i++){
            minIndex = i;
            for (int j = i + 1; j < A.length - 1; j++){
                if (A[j] < A[minIndex]){
                    minIndex = j;
                }
            }
            temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }

    }
}
