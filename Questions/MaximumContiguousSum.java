//Kadane's algorithm for finding maximum contiguous sub array .
import java.util.*;

public class MaximumContiguousSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Maximum Contiguous Sum is: " + KAlgo(arr, n));
    }
    public static int KAlgo(int arr[],int n){
        int prefix = 0;
        int maxc = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            prefix += arr[i];
            maxc = (int) Math.max(prefix, maxc);
            if (prefix < 0)
                prefix = 0;
        }
        return maxc;
    }
}