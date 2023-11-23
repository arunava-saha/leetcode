class Solution {

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};
        for(int i = 0; i<n; i++){
            if(nums[i]==target && ans[0] == -1){
                ans[0] = i;
                ans[1] = i; 
                continue;
            }else if(nums[i]==target && ans[1] != -1){
                ans[1] = i;
            }
        }
        return ans;
    }
}