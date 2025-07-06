package A5_Array;

import java.util.Scanner;

public class A7_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target number :");
        int x= sc.nextInt();
        System.out.println(" Enter array size :");
        int n = sc.nextInt();
        System.out.print("Enter array element :");
        int []arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();

        }
        //solution
        boolean flag = false;//false means not found
        for (int i = 0; i < n; i++) {
            if(x==arr[i]){
                flag = true;//true means found
break;}

        } if(flag==true) System.out.println("Element Found");
        else System.out.println("Element not found");


    }
}
