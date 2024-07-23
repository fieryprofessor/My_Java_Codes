import java.util.*;

public class JumpSearch {
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
        boolean answer = JSearch(arr, n, key);
        if (answer)
            System.out.println("Target found");
        else
            System.out.println("Target not found");
    }

    public static boolean JSearch(int arr[], int n, int key) {
        int start = 0, end = (int) Math.sqrt(n);
        while (arr[end] < key && start < n) {
            start = end;
            end += (int) Math.sqrt(n);
            if (end > n - 1)
                end = n - 1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == key)
                return true;
        }
        return false;
    }
}
/*
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 */
