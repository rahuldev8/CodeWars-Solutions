/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false

*/

public class isogram {
    public static boolean  isIsogram(String str) {
      
      int[] hash = new int[26];
      
      for(int i=0;i<str.length();i++)
        {
        if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') hash[str.charAt(i) - 'A']++;
        
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') hash[str.charAt(i) - 'a']++;
        
      }
      
      for(int i=0;i<25;i++)
        {
        if(hash[i]>1)return false;
      }
      
      return true;
        //Time Complexity : o(n)
      //Space Complexity : o(1)
    } 
}
