public class Main_Minus_Recursion {
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;

		// a should be greater
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		// formula
		return gcd(a - b, b);

		// int max = Math.max(a, b);
		// int min = Math.min(a, b);
		// return gcd(max - min, min);
	}
}
