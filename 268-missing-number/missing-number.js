/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    nums.sort(function(a, b){return a - b});
    console.log(nums)
        let a = nums.length;
        for(let i = 0; i<nums.length; i++){
            if(i !== nums[i]){
                a = i;
                console.log(a)
                break;
            }
        }
        return a;
};