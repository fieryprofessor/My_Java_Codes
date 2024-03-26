public class InsertionSort{

    public void sort(int arr[]){                    //Insertion Sort
        int size = arr.length ,temp;

        for(int i=1;i<size;i++){
            temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String args[]){                 //main method
        int arr[] = {5,2,4,3,1};
        InsertionSort obj = new InsertionSort();
        obj.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*Time Complexity = O(n^2)
 * Space Complexity = O(1)
 * Stable Sorting = Yes
 */