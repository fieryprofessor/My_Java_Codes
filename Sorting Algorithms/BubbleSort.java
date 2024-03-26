public class BubbleSort {

    public void sort(int arr[]) {                   //Original Bubble Sort
        int size = arr.length, temp;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swapping
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void sort2(int arr[]) {                  //Modified Bubble Sort
        int size = arr.length, temp, swapped = 1;

        for (int i = 0; i < size - 1 && swapped==1; i++) {
            swapped = 0;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = 1;
                }
            }
        }
    }
    public static void main(String args[]){                 //main method
        int arr[] = {5,2,4,3,1};
        BubbleSort b = new BubbleSort();
        b.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}