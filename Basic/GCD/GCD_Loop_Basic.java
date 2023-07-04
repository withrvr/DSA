public class GCD_Loop_Basic {
	public static int gcd(int a, int b) {
		int min = Math.min(a, b);
		int res = 1;

		for (int i = 2; i <= min; ++i)
			if (a % i == 0 && b % i == 0)
				res = i;

		return res;
	}
}
