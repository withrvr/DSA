# 📄: (6-Array) -> Find the Union and Intersection of the two sorted arrays.

- Maps > Sets ... can use if needed (Depends of Situation)
  - HashMap uses the unique keys to access the values
  - HashSet is completely based on objects and therefore retrieval of values is slower.
  - NOTE:
    - but its not true for all problems / cases
    - like in [i_d.java](./i_d.java) .... there is no direct method to find intersection .... here sets is more appropriate


# 🔗: Links

- [Union and Intersection GFG Page](https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/)
  - [Union Practice Problem](https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1)
    - [u_a.java](./u_a.java)
      - using hashset
      - adding all element in hashset
      - then return the size
    - [u_b.java](./u_b.java)
      - more better than a.java
      - using hashset
      - adding all element in hashset... off both array
      - but using min(wholes array len is small) ... add elements of both array to hashset at same time
      - then remaining element .. who's size was greater
    - [u_c.java](./u_c.java)
      - same as u_a.java
      - but using maps not sets
    - [u_d.java](./u_d.java)
      - same as u_b.java
      - but using maps not sets
  - [Intersection Practice Problem](https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1)
    - [i_a.java](./i_a.java)
      - sets
      - make arr1 as set
      - check which arr2 element in arr1
      - ie. element which is common
      - NOTE: remove that ele from set
      - because if arr2 contain more same ele
      - it will count it again ... but the intersection has been noted
    - [i_b.java](./i_b.java)
      - sets
      - build it method for intersection ... retainAll
    - [i_c.java](./i_c.java)
      - but using maps
      - same as i_a.java
    - [i_d.java](./i_d.java)
      - but using maps
      - same as i_b.java

<!--
- Other GFG similar problem
  - asdf
    - [GFG Page]()
    - [Practice Problem]()
      - []()
-->

- In my [LEETCODE Repo](https://github.com/withrvr/Leetcode) problem similar like this ... LINK:- [https://github.com/withrvr/Leetcode](https://github.com/withrvr/Leetcode)
  - 349. Intersection of Two Arrays
  - 350. Intersection of Two Arrays II
