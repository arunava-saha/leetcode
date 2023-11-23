class NumArray {
    int[] array;
    public NumArray(int[] nums) {
        int n = nums.length;
        array = nums;
        for(int i = 1; i < n; i++){
            array[i] += nums[i-1];
            System.out.println(array[i]);
        } 
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return array[right];
        return array[right]-array[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */