import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class InsertionSort {
    public static void main(String[] args) {

        int [] nums = {5,3,4,1,2};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void  swap(int arr[],int f, int second){
        int temp = arr[f];
        arr[f] = arr[second];
        arr[second] = temp;

    }
    public static void insertionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }

        }

    }


}