/*
Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]

*/

public class Maps {
  public static int[] map(int[] arr) {
    for(int i=0;i<arr.length;i++)
      {
      arr[i] = arr[i]*2;
    }
    return arr;

  }
}
