class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int vote = 0;
        int candidate =-1;
        int me = nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(vote==0){
                candidate = nums[i];
                vote = 1;
            }else if(candidate==nums[i]){
                vote++;
            }else{
                vote--;
            }
        }
         for(int i=0;i<nums.length;i++){
            if(candidate==nums[i]){
                count++;
            }
        }
         if(count>me){
                return candidate;
        }
        return -1;
    }
} 
