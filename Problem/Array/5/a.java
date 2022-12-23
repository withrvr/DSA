// tracking first +ve no.
// then swap with the next -ve no.

import java.util.Arrays;

public class a {
	public static void main(String[] args) {
		int[] arr = { -12, -11, 13, 5, 6, -7, 5, -3, -6 };
		// int[] arr = { -12, 11, 13, 5, 6, -7, 5, -3, -6 };

		// pos ... first pos no to replace with
		for (int i = 0, pos = 0, temp; i < arr.length; i++) { // pos ... position of 1st +ve no .... to which it will
																// swap
			if (arr[i] < 0) {
				if (i != pos) { // swap with itself ... no use ... // basically for series of starting -ve nos
								// it work // its like never encounter +ve nos
					temp = arr[i];
					arr[i] = arr[pos];
					arr[pos] = temp;
				}
				pos++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
