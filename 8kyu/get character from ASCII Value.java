/*DESCRIPTION:
Write a function get_char() / getChar() which takes a number and returns the corresponding ASCII char for that value.

In C, getchar() is an important built-in function, so the function will be named char_of_code to avoid confusion.

Example:

get_char(65)
should return:

'A'
For ASCII table, you can refer to http://www.asciitable.com/
*/

public class Ascii {
  public static char getChar(int c) {
    char ans = (char)c; 
    return ans;
    // ...
  }
}
