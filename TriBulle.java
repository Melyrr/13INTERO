public class TriBulle {
    public static void main(String[] args) {
    }
    public static void bubbleSort(int[] myArray) {
        for (int burstPos = 0;burstPos < myArray.length - 1;burstPos++) {
            for (int bubblePos = myArray.length - 1;bubblePos > burstPos;bubblePos--) {
            if (myArray[bubblePos] < myArray[bubblePos - 1]) {
                swap(myArray, bubblePos, bubblePos - 1);
                }
            }
        }
    }
    private static void swap(int[] myArray, int pos1, int pos2) {
        int value = myArray[pos1];
        myArray[pos1] = myArray[pos2];
        myArray[pos2] = value;
    }
}
