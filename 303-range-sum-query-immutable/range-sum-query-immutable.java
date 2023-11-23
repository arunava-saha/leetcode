class NumArray {
    int[] array;
    public NumArray(int[] nums) {
        int n = nums.length;
        array = nums;
        for(int i = 0; i < n; i++){
            array[i] = nums[i];
        } 
    }
    
    public int sumRange(int left, int right) {
        int ans = 0;
        for(int i = left; i<=right; i++){
            ans+=array[i];
        }
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */