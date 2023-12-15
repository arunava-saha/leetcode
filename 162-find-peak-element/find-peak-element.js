/**
 * @param {number[]} nums
 * @return {number}
 */
var findPeakElement = function(m) {
    if(m.length === 1) return 0;
        let a = 0;
    for(let i = 1; i<m.length; i++){
        if(m[i]>m[i-1]){
            a = i;
        }
    }
    return a;
};