public class CountingSort {
    
    public void sort(int arr[], int lowerRange, int upperRange) {       //count method
        int size = arr.length;
        int range = upperRange - lowerRange;
        int count[] = new int[range];

        for (int i = 0; i < size; i++) {
            count[arr[i] - lowerRange]++;
        }
        
        int j = 0;
        for (int i = 0; i < range; i++) {
            for (; count[i] > 0; (count[i])--) {
                arr[j++] = i + lowerRange;
            }
        }
    }
    public static void main(String args[]) {            //main method
        int array[] = { 4, 2, 1, 5, 3 };
        CountingSort obj = new CountingSort();
        obj.sort(array,0, 6);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/*
 *Time Complexity = O(n+k)
 * Space Complexity = O(k)
 * Stable Sorting = Yes
 * k is the number of distinct elements
 */