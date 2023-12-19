class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
  int n1 = s1.length();
  int n2 = s2.length();
  int n3 = s3.length();
  int i;
  for (i = 0; i < Math.min(Math.min(n1, n2), n3); i++) {
    char e1 = s1.charAt(i);
    char e2 = s2.charAt(i);
    char e3 = s3.charAt(i);
    if (e1 != e2) break;
    if (e2 != e3) break;
  }
  if (i == 0) return -1;
  return (n1 - i) + (n2 - i) + (n3 - i);
    }
}