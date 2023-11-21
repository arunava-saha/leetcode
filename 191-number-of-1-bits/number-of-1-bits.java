public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int len = str.length();
        for(int i = 0; i<len; i++){
            if(str.charAt(i)=='1'){
                ans++;
            }
        }
        return ans;
    }
}