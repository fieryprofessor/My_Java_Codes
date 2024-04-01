public class BinarySearch {
    
    public boolean search(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        BinarySearch obj = new BinarySearch();
        boolean answer = obj.search(array, 3);
        System.out.println("Element exists: " + answer);
    }
}