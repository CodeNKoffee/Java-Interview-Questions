package questions.maxChar;
import java.util.*;

public class MaxChar {

  public static void main(String[] args) {
    // Test cases
    System.out.println("Test Case 1: maxChar('aabbbccd')");
    char result1 = maxChar("aabbbccd");
    System.out.println("Expected Result: 'b'");
    System.out.println("Actual Result: '" + result1 + "'");
    System.out.println("Test Passed: " + (result1 == 'b'));
    System.out.println();

    System.out.println("Test Case 2: maxChar('foo 111123')");
    char result2 = maxChar("foo 111123");
    System.out.println("Expected Result: '1'");
    System.out.println("Actual Result: '" + result2 + "'");
    System.out.println("Test Passed: " + (result2 == '1'));

    assert result1 == 'b';
  }

  public static char maxChar(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(s.charAt(i)))
        map.put(s.charAt(i), 0);
      map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
    }
    int max = -1;
    char maxChar = ' ';
    for (Character key : map.keySet())
      if (map.get(key) > max) {
        max = map.get(key);
        maxChar = key;
      }
    return maxChar;
  }
  // public static char maxChar (String s) {
  //   int[] charray = new int [999];
  //   for (int i = 0; i < s.length(); i++)
  //     charray[s.charAt(i)]++;
  //   int maxInd = 0;
  //   for (int i = 1; i < 999; i++)
  //   if (charray[i] > charray[maxInd])
  //       maxInd = i;
  //   return (char)(maxInd);
  // }
}
