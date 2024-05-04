public class ArrayReverseLab1 {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        reverseArray(array);
    }
    public static void reverseArray(int[] array) {
        printArray(array);
        for (int i = 0, j = 0, k = array.length - 1; i < array.length / 2; i++, j++, k--) {
            int first = array[j];
            array[j] = array[k];
            array[k] = first;
        }
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }
}
