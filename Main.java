public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(k + " largest element is " + findKthLargest(arr, k));
    }

    public static int findKthLargest(int[] arr, int k) {
        selectionSort(arr, k);
        return arr[arr.length - k];
    }

    public static void selectionSort(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1 && i < k; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxElement(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static int getMaxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
