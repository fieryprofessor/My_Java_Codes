public class LinearSearch {
    
    public boolean search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return true;
        }
        return false;
    }
    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        LinearSearch obj = new LinearSearch();
        boolean answer = obj.search(array, 3);
        System.out.println("Element exists: "+answer);
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */