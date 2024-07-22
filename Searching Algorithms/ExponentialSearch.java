import java.util.*;

public class ExponentialSearch {
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
        boolean answer = ESearch(arr, n, key);
        if (answer)
            System.out.println("Target found");
        else
            System.out.println("Target not found");
    }

    public static boolean ESearch(int arr[], int n, int key) {
        if (arr[0] == key)
            return true;

        int i = 1;
        while (i < n && arr[i] <= key)
            i *= 2;

        return BSearch(arr, i / 2, i, key);
    }

    public static boolean BSearch(int arr[], int l, int r, int key) {
        while (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == key)
                return true;
            else if (arr[mid] > key)
                return BSearch(arr, l, mid - 1, key);
            else
                return BSearch(arr, mid + 1, r, key);
        }
        return false;
    }
}
/*
 * Time Complexity: O(log(n))
 * Space Complexity: O(1)
 */
