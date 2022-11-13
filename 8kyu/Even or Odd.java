/*
DESCRIPTION:
Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.*/

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        
      String ans;
      if(number%2 == 0)ans = "Even";
      else ans = "Odd";
      return ans;
    }
}
