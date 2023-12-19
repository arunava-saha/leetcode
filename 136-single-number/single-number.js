/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    if(nums.length === 1){
        return nums[0];
    }
    nums.sort();
    console.log(nums)
    let a = nums[nums.length-1];
    for(let i = 1; i<nums.length; i+=2){
        if(nums[i]!==nums[i-1]){
            a = nums[i-1];
            break;
        }
    }
    return a
};