public class Solution {
  public String longestPalindrome(String s) {
    int sLen = s.length();
    int resLen = 0;
    String palindromeSubString = "";
    for (int idx = 0; idx < sLen; idx++) {
      // checkout odd
      int[] oddPalindromeIdx = longestPalindromeFind(s, idx, idx);
      // checkout even
      int[] evenPalindromeIdx = longestPalindromeFind(s, idx, idx+1);
      if (resLen < oddPalindromeIdx[1]-oddPalindromeIdx[0]+1) {
        resLen = oddPalindromeIdx[1] - oddPalindromeIdx[0] + 1;
        palindromeSubString = s.substring(oddPalindromeIdx[0], oddPalindromeIdx[1]+1);
      }
      if (resLen < evenPalindromeIdx[1]-evenPalindromeIdx[0]+1) {
        resLen = evenPalindromeIdx[1] - evenPalindromeIdx[0] + 1;
        palindromeSubString = s.substring(evenPalindromeIdx[0], evenPalindromeIdx[1]+1);
      }
    }
    return palindromeSubString;
  }
  public int[] longestPalindromeFind(String s, int startLeft, int startRight) {
    int[] palindromeIdx = new int[]{0,0};
    int sLen = s.length();
    int left = startLeft;
    int right = startRight;
    int resLen = 0;
    while(left >= 0 && right < sLen && s.charAt(left) == s.charAt(right) ) {
      if (right - left + 1 >  resLen) {
        palindromeIdx[0] = left;
        palindromeIdx[1] = right;
        resLen = right - left + 1;
        right++;
        left--;
      }
    }
    return palindromeIdx;
  }
}
