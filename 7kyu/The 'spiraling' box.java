/*
Given two positive integers m (width) and n (height), fill a two-dimensional list (or array) of size m-by-n in the following way:

(1) All the elements in the first and last row and column are 1.

(2) All the elements in the second and second-last row and column are 2, excluding the elements from step 1.

(3) All the elements in the third and third-last row and column are 3, excluding the elements from the previous steps.

And so on ...

Examples
create_box(5, 8) should return

[[1, 1, 1, 1, 1],
 [1, 2, 2, 2, 1],
 [1, 2, 3, 2, 1],
 [1, 2, 3, 2, 1],
 [1, 2, 3, 2, 1], 
 [1, 2, 3, 2, 1],
 [1, 2, 2, 2, 1],
 [1, 1, 1, 1, 1]]
 */

public class SpiralingBox
{
    public static int[][] createBox(int width, int length)
    {
      int[][] target = new int[length][width];
      
      int start_row = 0, start_col = 0;
      int end_row = target.length-1, end_col = target[0].length-1;
      
      int value = 1;
      
      while(start_row <= end_row && start_col<=end_col)
        {
        //right direction
        for(int i=start_col; i<=end_col; i++)
          {
          target[start_row][i] = value;
        }
        
        start_row++;
        
        //down direction
        for(int i=start_row; i<=end_row; i++)
          {
          target[i][end_col] = value;
        }
        
        end_col--;
        
        //left direction
        if(start_row <= end_row)
          {
          for(int i=end_col; i>=start_col; i--)
            {
            target[end_row][i] = value;
          }
        }
        end_row--;
        
        //Up direction
        if(start_col <= end_col)
          {
          for(int i=end_row; i>=start_row; i--)
            {
            target[i][start_col] = value;
          }
        }
        start_col++;
        value++;
        
      }
      
      return target;
      
      //Time Complexity : O(n^2)
      //Space Complexity : O(n^2)
    }
}
