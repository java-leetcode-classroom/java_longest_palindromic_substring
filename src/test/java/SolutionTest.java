import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void longestPalindromeExample1() {
    assertEquals("aaaaa", sol.longestPalindrome("aaaaa"));
  }
  @Test
  void longestPalindromeExample2() {
    assertEquals("bab", sol.longestPalindrome("babad"));
  }
  @Test
  void longestPalindromeExample3() {
    assertEquals("bb", sol.longestPalindrome("cbbd"));
  }
}