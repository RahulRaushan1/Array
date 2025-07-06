package A5_Array;

public class A8_MaxvalueInArray {
    public static void main(String[] args) {
        int[] arr = {18, 34, 2, 5, 78};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];}

            }
        System.out.println(max);
        }
    }
