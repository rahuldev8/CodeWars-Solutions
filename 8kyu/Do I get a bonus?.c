/*
It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?

Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.

If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.

Return the total figure the individual will receive as a string prefixed with "£" (= "\u00A3", JS, Go, Java, Scala, and Julia), "$" (C#, C++, Ruby, Clojure, Elixir, PHP, Python, Haskell, and Lua) or "¥" (Rust).*/


#include <stdbool.h>
#include <stdlib.h>

typedef unsigned long long ull;

char *bonus_time(ull salary, bool bonus) {

  //Create a variable ans of char* type, initially assign to NULL
  char *ans = NULL;
  //cheacking if bouns is +ve or -ve, updating value regrads this
  if(bonus)
    salary *= 10;
  //asprintf is identical to printf, but here the first argument should send the 
  //output to the specified string.
  //Therefore the required string is now stored in ans string, using its address
  asprintf(&ans,"$%llu",salary);
  
  //returning the ans string
  return ans;

}
