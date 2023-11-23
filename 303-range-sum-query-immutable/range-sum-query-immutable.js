/**
 * @param {number[]} nums
 */
var NumArray = function(nums) {
    this.size = nums.length;
    this.sum = Array(nums.length).fill(0);
    this.sum[0] = nums[0];

    for(let i = 1; i<this.size; i++){
        this.sum[i]=this.sum[i-1] + nums[i]
    } 
};

/** 
 * @param {number} left 
 * @param {number} right
 * @return {number}
 */
NumArray.prototype.sumRange = function(left, right) {
    if(left===0) return this.sum[right];
    return this.sum[right]-this.sum[left-1]
};

/** 
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */