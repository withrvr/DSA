class Solution
{
public:
	// long long fact(long long n)
	// {
	// 	if (n < 2)
	// 		return 1;

	// 	long long fac = 1;

	// 	for (long long i = 2; i <= n; i++) // for (int i = n; i > 1; i--)
	// 		fac *= i;

	// 	return fac;
	// }

	// long long ncr(long long n, long long r)
	// {
	// 	long long mul;
	// 	if (n < r)
	// 		mul = 0;
	// 	else if (n == r) // to save time
	// 		mul = 1;
	// 	else
	// 		mul = fact(n) / (fact(r) * fact(n - r));

	// 	// cout << n << "c" << r << " = " << mul;
	// 	// NEWLINE;

	// 	return mul;
	// }

	long long ncr(long long n, long r)
	{
		if (r > n)
			return 0;
		if (r == n) // to save time my be
			return 1;
		long long res = 1;
		for (long long i = 0; i < r; i++)
		{
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

	long long count(long long num)
	{
		// cout << "Num = " << num;
		// NEWLINE;

		long long result = 0;
		int nob = 0; // no of bits // n = nob - 1
		int no1 = 0; // no of ones // r // setbits

		do
		{
			nob++;
			if (num & 1)
			{
				no1++;
				// cout << "1 - ";
				result += ncr(nob - 1, no1);
			}
			// else
			// {
			// 	cout << "0 - ***";
			// 	NEWLINE;
			// }

		} while (num >>= 1);

		// cout << "Result  = " << result;
		// NEWLINE;
		// NEWLINE;
		return result;
	}
};