package A5_Array;
import java.util.Scanner;
public class A2_TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[8];
        for ( i = 0; i <=7 ; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
