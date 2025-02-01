class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }
        return true;
    }
}
// 2
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int par = nums[0] % 2; // Initialize with the parity of the first element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == ini) {
                return false;
            }
            par = nums[i] % 2; // Update ini to the parity of the current element
        }
        return true;
    }
}
