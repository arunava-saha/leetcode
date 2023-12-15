class Solution {
    public List<Integer> findPeaks(int[] m) {
            List<Integer> a = new ArrayList<>();
    for(int i = 1; i<m.length -1; i++){
        if(m[i]>m[i-1] && m[i]>m[i+1]){
            a.add(i);
        }
    }
    return a;

    }
}