/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumCount = function(nums) {
    let ans = 0;
    let k=0;
    let j=0;
    for(let i = 0; i<nums.length; i++){
        
        if(nums[i]>0){
            k++;
        }
        if(nums[i]<0){
            j++;
        }
    }
    ans = Math.max(k,j)
    return ans;
};