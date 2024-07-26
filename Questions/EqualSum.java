import java.util.*;
public class EqualSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean answer = equalSumCal(arr, n);
        if (answer)
            System.out.println("Yes, the array can be divided into two sub arrays of equal sum.");
        else
            System.out.println("No, the array cannot be divided into two sub arrays of equal sum");
    }

    public static boolean equalSumCal(int arr[], int n) {
        int totalsum = 0;
        for (int i = 0; i < n; i++) {
            totalsum += arr[i];
        }

        int prefix = 0;
        for (int i = 0; i < n - 1; i++) {
            prefix += arr[i];
           
            if (totalsum == 2*prefix)
                return true;
        }
        return false;
    }
}
