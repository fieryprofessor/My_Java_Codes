public class QuickSort {
    
    private int partition(int arr[], int low, int high) {           //partition method
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //putting pivot from last position to correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public void sort(int arr[], int low, int high) {            //sort method
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
        
    }
    public static void main(String args[]) {            //main method
        int array[] = { 3, 5, 4, 1, 2 };
        QuickSort obj = new QuickSort();
        obj.sort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
