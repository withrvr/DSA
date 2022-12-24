// but using maps
// same as i_a.java

// time : 2.11

import java.util.HashMap;

class Solution {
	public static int NumberofElementsInIntersection(int arr1[], int arr2[], int l1, int l2) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;

		for (int ele : arr1)
			hm.put(ele, null);

		for (int ele : arr2) {
			if (hm.containsKey(ele)) {
				System.out.print(ele + ", ");

				count++;
				hm.remove(ele); // return val of ele .... if needed
			}
		}

		return count;
	}
};
