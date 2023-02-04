#include <iostream>
using namespace std;

class Solution
{
public:
	void rearrange(long long *arr, int n)
	{
		int s = 0, e = n - 1, t;

		while (s < e)
		{
			cout << arr[e--] << ' ';
			cout << arr[s++] << ' ';
		}
		// cout << "(" << s << "-" << e << ")";

		if (s == e)
			cout << arr[s] << ' ';
	}
};

int main()
{
	int n = 5;
	long long arr[5] = {0, 1, 2, 3, 4};

	Solution ob;
	ob.rearrange(arr, n);
	cout << endl;

	return 0;
}
