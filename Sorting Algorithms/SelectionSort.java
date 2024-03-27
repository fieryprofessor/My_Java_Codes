public class SelectionSort {

    public void sort(int arr[]) {                   //Selection Sort
        int size = arr.length, min, temp;
        for (int i = 0; i < size-1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
       }
    }

    public static void main(String args[]) {                     //main method
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
