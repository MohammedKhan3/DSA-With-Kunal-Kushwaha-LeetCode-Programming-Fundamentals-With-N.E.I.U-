import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int []arr = {5,3,1,2,4};
       cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int arr[]){
        int i = 0;
        /**
         *      ***Basic Idea***
         *        0,1,2,3,4
         * arr = {5,3,1,2,4}
         * i = 3
         * arr[3] = 2;
         * but it's index should be 2--> we can achieve that by arr[3]-1 = 2-1= 1;
         * arr[1] = 3,
         * so we swap arr[1] with arr[3] and we get {5,2,1,3,4}
         * Repeat until its sorted
         */
        //int correct
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    public static void swap(int arr[], int firstNum, int secondNum){
       
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;


    }

}

