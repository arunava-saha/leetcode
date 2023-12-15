class Solution {
    public int findPeakElement(int[] m) {
        if(m.length == 1) return 0;
        int a = 0;
    for(int i = 1; i<m.length; i++){
        if(m[i]>m[i-1]){
            a = i;
        }
    }
    return a;
    }
}