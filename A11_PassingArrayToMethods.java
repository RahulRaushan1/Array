package A5_Array;

public class A11_PassingArrayToMethods {
    public static void main(String[] args) {
        int arr[] = { 10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0]= 90;
    }
}
    