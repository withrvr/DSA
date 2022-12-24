// but using maps
// same as i_b.java
// build it method for intersection ... retainAll

// time : 2.38

import java.util.HashMap;

class Solution {
	public static int NumberofElementsInIntersection(int arr1[], int arr2[], int l1, int l2) {
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();

		for (int ele : arr1)
			hm1.put(ele, null);

		for (int ele : arr2)
			hm2.put(ele, null);

		System.out.println("BEFORE: ");
		System.out.println("hm1: " + hm1.toString());
		System.out.println("hm2: " + hm2.toString());

		hm1.keySet().retainAll(hm2.keySet());
		// remove all the common ele .. of hm1 which matches to hm2
		// ie. hm1 becomes .. intersection

		System.out.println("AFTER: ");
		System.out.println("hm1: " + hm1.toString());
		System.out.println("hm2: " + hm2.toString());

		return hm1.size();
	}
};
