import java.util.*;
public class MergeSortedArrays {
    public static void main(String[] args) {
        int []nums = {1,2,3,0,0,0};
        int []nums2 = {2,5,6};
        int []mergedArray = merge(nums,nums.length,nums2, nums2.length);
        System.out.println(Arrays.toString(mergedArray));
        bubblesort(mergedArray);
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        //first merge it.
        int [] msort = new int[m+n];
        for(int i = 0 ; i < m;i++){
            msort[i] = nums1[i];
        }
        for(int i = 0 ; i <n;i++){
            int size = i + m;
            msort[size] = nums2[i];
        }
        return msort;
    }
    public static void bubblesort(int[]nums){

        for (int i = 0; i <nums.length-1 ; i++) {

            for (int j = 0; j < nums.length-i-1; j++) {

                if(nums[j]>nums[j+1]){
                   int temp = nums[j];
                   nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }

    }

}
