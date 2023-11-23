class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String answer = "";
        String a = countAndSay(n-1);
        int l = 1;
        for(int i = 0; i<a.length(); i++){
            if(i == a.length()-1 || a.charAt(i) != a.charAt(i+1)){
                answer += l;
                answer += a.charAt(i);
                l = 1;
            } else{
                l++;
            }
        }
        return answer;
    }
}