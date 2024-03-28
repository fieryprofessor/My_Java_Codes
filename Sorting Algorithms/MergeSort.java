public class MergeSort {

    private void merge(int arr[], int tempArray[], int lowerIndex, int middle, int upperIndex) { //merge method

        int lowerStart = lowerIndex;
        int lowerStop = middle;
        int upperStart = middle + 1;
        int upperStop = upperIndex;
        int count = lowerIndex;

        while (lowerStart <= lowerStop && upperStart <= upperStop) {
            if (arr[lowerStart] < arr[upperStart]) {
                tempArray[count++] = arr[lowerStart++];
            } else {
                tempArray[count++] = arr[upperStart++];
            }
        }
        while (lowerStart <= lowerStop) {
            tempArray[count++] = arr[lowerStart++];
        }
        while (upperStart <= upperStop) {
            tempArray[count++] = arr[upperStart++];
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            arr[i] = tempArray[i];
        }

    }

    public void sort(int arr[], int lowerIndex, int upperIndex) { //partition method
        int tempArray[] = new int[arr.length];
        if (lowerIndex >= upperIndex) {
            return;
        }
        int middle = (lowerIndex + upperIndex) / 2;
        sort(arr, lowerIndex, middle);
        sort(arr, middle + 1, upperIndex);
        merge(arr, tempArray, lowerIndex, middle, upperIndex);
    }

    public static void main(String args[]) { //main method
        int array[] = { 4, 2, 5, 1, 3 };
        MergeSort obj = new MergeSort();
        obj.sort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

/*
 * Time Complexity = O(n.log(n))
 * Space Complexity = O(n)
 * Stable Sorting = Yes
 */
