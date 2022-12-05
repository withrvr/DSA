# Find the maximum and minimum element in an array

- [a.cpp](./a.cpp)
  - INFINITY var

- 2nd METHOD approach
  - Algorithmic Paradigm: Divide and Conquer
  - but not done by own
  - but understood
  ```Pair MaxMin(array, array_size)
   if array_size = 1
      return element as both max and min
   else if arry_size = 2
      one comparison to determine max and min
      return that pair
   else    /* array_size  > 2 */
      recur for max and min of left half
      recur for max and min of right half
      one comparison determines true max of the two candidates
      one comparison determines true min of the two candidates
      return the pair of max and min
  ```

# Links

- [b.cpp](./b.cpp)
  - [Practice Problem](https://practice.geeksforgeeks.org/problems/max-min/1)
- [GFG Page](https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/)

- Leetcode
  - [2293. Min Max Game](https://leetcode.com/problems/min-max-game/description/)
    - [Solution](https://leetcode.com/problems/min-max-game/solutions/2876854/)
  - [2091. Removing Minimum and Maximum From Array](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/description/)
    - [other/better/best solution](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/solutions/2880132/)
    - [First solution which came in my mind using ... min / max position from left right both ... sign -ve/+ve to know both right/both left or not](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/submissions/854944924/)
