class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int a = nums.length;
        for(int i = 0; i<nums.length; i++){
            if(i != nums[i]){
                a = i;
                break;
            }
        }
        return a;
    }
}