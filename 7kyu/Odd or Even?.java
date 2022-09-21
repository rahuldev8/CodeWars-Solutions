/*
Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Examples:
Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"
Have fun!*/

public class Codewars {
  public static String oddOrEven (int[] array) {
    int ans = 0;
    for(int i=0;i<array.length;i++)
      {
      ans += array[i];
    }
    if(ans%2 == 0)return "even";
    else return "odd";
  // your code
  }
}
