class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1) return 1;
        Map<Integer, Integer> map = new HashMap<>(); 
        return sol(n, map);        
    }
    int sol(int n, Map<Integer, Integer> map) {
        if(n==0 || n==1) return 1;
        if(!map.containsKey(n)) map.put(n, sol(n-1, map)+sol(n-2, map));
        return map.get(n);
    }
}