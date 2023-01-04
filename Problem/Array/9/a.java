// a.java ... is wrong ... solution/thinking

// one of the hardest question to understand for me
// worked for me:- https://www.youtube.com/watch?v=29uyA4F9t5I&ab_channel=ShashwatTiwari

// my problem while thinking
// { 1, 2, 2, 2, 3, 3, 4, 6, 7, 10 }
// k = 5
// here use abs diff
// | (10-5) - (1+5) | = | 5-6 | = | -1 | = 1
// don't work because
// after modifying all the ele .. by k .. in arr
// 1st and last ele are not greatest or smallest ... any more

import java.util.Arrays;

class Solution {
	int getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		int min = arr[0];
		int max = arr[n - 1];

		return Math.abs((max - k) - (min + k));
	}
}