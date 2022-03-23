package CarolynDelaTorre;

import java.util.Arrays;

public class checkingwhetherthetwostringsareanagram {
 
  public static void main(String[] args) {
    
    String s1 = "def";
    String s2 = "efd";
    
    boolean checkAnagram = isAnagrams(s1,s2);
    if(checkAnagram)
        System.out.println("Both strings are anagram.");
        else
        System.out.println("Both strins are not anagram.");
  }
  
  private static boolean isAnagrams(String s1, String s2) {
      char[] c1 = s1.toCharArray();
      char[] c2 = s2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      
if(Arrays.toString(c1).equals(Arrays.toString(c2)))
          return true;
        return false;
  }
  
  
}
