class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]==target){
                ans=i;
                break;
            }else if(target<nums[i]){
                ans=i;
                break;
            }else if(i == n-1 && target>nums[i]){
                ans=n;
            }
        }
        return ans;
    }
}