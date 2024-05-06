import java.util.ArrayList;

public class ArrayNegativeBeforePositiveLab1 {
    public static void main(String[] args) {
        int[] array = {25, 12, 0, -7, -4, 26, -2, 18,-9, 11};
        printArray(array);
        int[] output = negativeBeforePositive(array);
        printArray(output);
    }
    public static int[] negativeBeforePositive(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0 && array[j] < 0) {
                    list.add(array[j]);
                }
                else if (i == 1 && array[j] >= 0) {
                    list.add(array[j]);
                }
            }
        }
        int[] newArray = new int[array.length];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
