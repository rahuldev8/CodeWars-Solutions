/*
An infinite number of shelves are arranged one above the other in a staggered fashion.
The cat can jump up to 3 shelves at the same time: from shelf 1 to shelf 2 or 4 (the cat cannot climb on the shelf directly above its head), according to the illustration:

                 ┌────────┐
                 │-6------│
                 └────────┘
┌────────┐       
│------5-│        
└────────┘  ┌─────► OK!
            │    ┌────────┐
            │    │-4------│
            │    └────────┘
┌────────┐  │
│------3-│  │     
BANG!────┘  ├─────► OK! 
  ▲  |\_/|  │    ┌────────┐
  │ ("^-^)  │    │-2------│
  │ )   (   │    └────────┘
┌─┴─┴───┴┬──┘
│------1-│
└────────┘
Input
Start and finish shelf numbers (always positive integers, finish no smaller than start)

Task
Find the minimum number of jumps to go from start to finish

Example
Start 1, finish 5, then answer is 2 (1 => 4 => 5 or 1 => 2 => 5)

*/

public class Kata 
{
  public static int solution(int start, int finish)
  {
    int jumps = 0;
    //start to climb the multiple of 3 shelves first
    //then remaining steps which is strictly less than 3 (2,1)
    jumps = ((finish-start)/3) + (finish-start)%3;
    return jumps;
    
    //Time Complexity : o(1)
    //Space Complexity : o(1)
  }
}
