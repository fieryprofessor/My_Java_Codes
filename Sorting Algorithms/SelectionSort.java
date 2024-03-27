public class SelectionSort {

    public void sort(int arr[]) { //Selection Sort
        int size = arr.length, max, temp;
        for (int i = 0; i < size - 1; i++) {
            max = 0;
            for (int j = 1; j < size - i; j++) {
                if (arr[j] > arr[max])
                    max = j;
                temp = arr[size - 1 - i];
                arr[size - 1 - i] = arr[max];
                arr[max] = temp;
            }
        }
    }

    public static void main(String args[]) { //main method
        int arr[] = { 4, 2, 1, 5, 3 };
        SelectionSort obj = new SelectionSort();
        obj.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

/*
 * Time Complexity = O(n^2)
 * Space Complexity = O(1)
 * Stable Sorting = No
 */
