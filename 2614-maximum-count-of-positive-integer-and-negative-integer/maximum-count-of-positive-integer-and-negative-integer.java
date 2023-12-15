class Solution {
    public int maximumCount(int[] nums) {
        int ans = 0;
    int k=0;
    int j=0;
    for(int i = 0; i<nums.length; i++){
        
        if(nums[i]>0){
            k++;
        }
        if(nums[i]<0){
            j++;
        }
    }
    ans = Math.max(k,j);
    return ans;
    }
}