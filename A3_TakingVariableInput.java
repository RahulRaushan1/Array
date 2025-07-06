package A5_Array;

import java.util.Scanner;

public class A3_TakingVariableInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number :");
        int n = sc.nextInt();

        int []arr = new int[n];

        for (int i = 0; i <=n-1 ; i++) {//input
            arr [i]= sc.nextInt();


        }
        for (int i = 0; i <=n-1 ; i++) {//output
            System.out.print(arr[i]+" ");

        }
    }
}
