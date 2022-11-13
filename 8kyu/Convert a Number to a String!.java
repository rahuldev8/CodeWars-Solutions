/*
We need a function that can transform a number (integer) into a string.

What ways of achieving this do you know?

In C, return a dynamically allocated string that will be freed by the test suite.

Examples (input --> output):
123  --> "123"
999  --> "999"
-100 --> "-100"*/

class Kata {
  public static String numberToString(int num) {
    
    String ans = String.valueOf(num);
    return ans;
  }
}
