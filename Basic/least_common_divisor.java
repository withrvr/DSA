public class least_common_divisor {
	public static void main(String args[]) {
		int num_1 = 7, num_2 = 3;
		int min = Math.min(num_1, num_2);
		int res = 1;

		for (int i = 2; i <= min; ++i)
			if (num_1 % i == 0 && num_2 % i == 0) {
				res = i;
				break;
			}

		System.out.print("LCM (Least Common Multiple): " + res);
	}
}
