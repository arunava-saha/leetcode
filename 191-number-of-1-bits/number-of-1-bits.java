public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans=0;
        //TC => O(k), where k is total number of set bits. set bit is 1. unset bit is 0.
         while(n!=0){
             n = n & (n-1);
            ans++;
        }
 
        return ans;
    }
}