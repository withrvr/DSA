public class Main_While {
	public static int gcd(int a, int b) {
		while (a > 0) {
			// a, b = b % a, a;
			int temp = a;
			a = b % a;
			b = temp;
		}

		return b;
	}
}
