class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int len = 1;
        for(int i = 0 ; i<nums.length-1 ; i++){
            if(nums[i]>nums[i+1]){
                len++;
            }
            else{
                len=1;
            }
            max = Math.max(len,max);
        }
        len = 1;
        for(int i = 0 ; i<nums.length-1 ; i++){
            if(nums[i]<nums[i+1]){
                len++;
            }
            else{
                len=1;
            }
            max = Math.max(len,max);
        }
        return max;
    }
}

// in one loop

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0) return 0; 
        int max = 1;
        int incLen = 1;
        int decLen = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                incLen++;
                decLen = 1; 
            }
            else if (nums[i] < nums[i - 1]) {
                decLen++;
                incLen = 1; 
            }
            else {
                incLen = 1;
                decLen = 1;
            }
            max = Math.max(max, Math.max(incLen, decLen));
        }
        return max;
    }
}
