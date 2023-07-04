public class GCD_Loop_Reverse {
	public static int gcd(int a, int b) {
		for (int i = Math.min(a, b); i > 1; --i)
			if (a % i == 0 && b % i == 0)
				return i;

		return 1;
	}
}
