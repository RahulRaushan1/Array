package A5_Array;

public class A8_method2 {
    public static void main(String[] args) {
        int[]arr={ -1,-8,-89,-67,-378};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
           // if (arr[i]>max) max=arr[i];
            max = Math.max(max,arr[i]);

        }int smax=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if( arr[i] !=max)
            smax=Math.max(smax,arr[i]);

        }
        System.out.println(max);
        System.out.println(smax);

    }
}
