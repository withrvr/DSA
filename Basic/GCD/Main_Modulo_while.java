public class Main_Modulo_while {
	public static int gcd(int a, int b) {
		while (b > 0 && a > 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}

		if (a == 0)
			return b;

		return a;
	}
}
