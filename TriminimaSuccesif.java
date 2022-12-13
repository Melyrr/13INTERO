public class TriminimaSuccesif {
    public static void main(String[] args) {
    }
    public static void selectionSort(int[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) {
            int minIndex = searchMinIndex(myArray, i, myArray.length -1);
            if (minIndex != i) {
            swap(myArray, i, minIndex);
                }
            }
        }
        public static int searchMinIndex(int[] myArray,int begin,int end) {
        int minIndex = begin;
        for (int i = begin + 1; i <= end; i++) {
            if (myArray[i] < myArray[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    private static void swap(int[] myArray, int pos1, int pos2) {
        int value = myArray[pos1];
        myArray[pos1] = myArray[pos2];
        myArray[pos2] = value;
    }
}