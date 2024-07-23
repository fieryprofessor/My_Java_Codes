import java.util.*;

public class InterpolationSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int key = sc.nextInt();
        sc.close();
        boolean answer = ISearch(arr, key, 0, n-1);
        if (answer)
            System.out.println("Target found");
        else
            System.out.println("Target not found");
    }

    public static boolean ISearch(int arr[], int key, int l, int r) {
        
        while (r >= l ) {
           int m = l + (((r - l) / (arr[r] - arr[l])) * (key - arr[l]));
            if (arr[m] == key)
                return true;
            else if (arr[m] > key)
                return ISearch(arr, key, l, m - 1);
            else
                return ISearch(arr, key, m + 1, r);
        }
        return false;
    }
}
/*
 * Time Complexity: O(n) Θ(log(log(n)))
 * Space Complexity: O(1)
 */
