class Solution
{
public:
	long long count(long long orignal_num)
	{
		int num_no1 = 0; // no of ones
		int num_no0 = 0; // no of zeros
		int counter = 0;
		long long num = orignal_num;

		do
			(num & 1) ? num_no1++ : num_no0++; // ( num % 2 )
		while (num >>= 1);					   // (num /= 2)

		// cout << "orignal_num = " << orignal_num;
		// NEWLINE;
		// cout << "num = " << num;
		// NEWLINE;
		// cout << "num_no0 = " << num_no0;
		// NEWLINE;
		// cout << "num_no1 = " << num_no1;
		// NEWLINE;

		int no1, no0;
		long long n;

		for (long long i = orignal_num - 1; i >= 0; i--)
		{
			no1 = 0;
			no0 = 0;
			n = i;

			// cout << "n = " << n;

			do
				(n & 1) ? no1++ : no0++;
			while (n >>= 1);

			// cout << ", no0 = " << no0;
			// cout << ", no1 = " << no1;
			// NEWLINE;

			if (no1 == num_no1)
				counter++;
		}

		return counter;
	}
};