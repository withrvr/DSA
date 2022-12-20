# 📄: (4-Array) --> Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

- [a.java](./a.java)
  - counting number of 0's, 1's, and 2's.
  - Overwrite array with the total number
  - of 0's, then 1's and followed by 2's.

- [b.java](./b.java)
  - swaping
  - while tracking the last positions of the 0, 2
  - and traversing using mid ... and sorting

- [c.java](./c.java)
  - see which number is it
  - then add one more to where it belongs // like insertion sort
  - and at one one element to other numbers also .. who are after it



# 🔗: Links

- Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
  - [GFG Page](https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/)
  - [Practice Problem](https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1)
-
- Other GFG similar problem
  - Segregate 0s and 1s in an array
    - [GFG Page](https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/)
    - [GFG Practice](https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article)
      1. Using sort method
      2. Counting no of zero .. then replace same array starting with 0's ... then other remaining with 1's
      3. left right flag
         - [o1.java](./o1.java)
         - tracking
         - swap / make it 0 and 1
-
- In my [LEETCODE Repo](https://github.com/withrvr/Leetcode) problem similar like this ... [@withrvr/leetcode](https://github.com/withrvr/Leetcode)
  - 75. Sort Colors
    - was fully same as main question
    - only 0,1,2 where are rwb (red,white,blue)
