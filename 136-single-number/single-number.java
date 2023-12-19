class Solution {
    public int singleNumber(int[] nums) {
    if(nums.length == 1){
        return nums[0];
    }
    Arrays.sort(nums);
    int a = nums[nums.length-1];
    for(int i = 1; i<nums.length; i+=2){
        if(nums[i]!=nums[i-1]){
            a = nums[i-1];
            break;
        }
    }
    return a;
    }
}