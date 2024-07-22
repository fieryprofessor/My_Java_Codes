import java.util.*;

public class TernarySearch {
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
        boolean answer = TSearch(arr, 0, n, key);
        if (answer)
            System.out.println("Target found");
        else
            System.out.println("Target not found");
    }

    public static boolean TSearch(int[] arr, int l, int r, int key) {

        while (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            if (arr[mid1] == key || arr[mid2] == key)
                return true;
            else if (key < arr[mid1])
                return TSearch(arr, l, mid1 - 1, key);
            else if (key > arr[mid2])
                return TSearch(arr, mid2 + 1, r, key);
            else
                return TSearch(arr, mid1 + 1, mid2 - 1, key);
        }
        return false;
    }
}
/*
 * Time Complexity: O(log(n))
 * Space Complexity: O(log(n))
 */
