#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
	void rearrange(long long *arr, int n)
	{
		vector<long long int> vc;
		int s = 0, e = n - 1;

		while (s <= e)
		{
			cout << "\n(e" << arr[e] << "-s" << arr[s] << ")\n=>";

			vc.push_back(arr[e--]);
			vc.push_back(arr[s++]);

			// e--;
			// s++;

			for (int i : vc)
				cout << " " << i;
		}
		// NOTE: i<n
		// when n is odd
		// the last element is added 2 times
		// but its neglected here

		for (int i = 0; i < n; i++)
			arr[i] = vc[i];
	}
};

int main()
{
	int n = 6;
	long long arr[6] = {0, 1, 2, 3, 4};

	cout << "ARR\n";
	for (int i = 0; i < n; i++)
		cout << arr[i] << " ";
	cout << endl;

	Solution ob;
	ob.rearrange(arr, n);

	cout << "\n\nRESULT\n";
	for (int i = 0; i < n; i++)
		cout << arr[i] << " ";

	return 0;
}
