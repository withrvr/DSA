#include <algorithm>
using namespace std;

class Solution
{
public:
	int kthSmallest(int arr[], int s, int e, int k)
	{
		// greater<int>()
		sort(arr + s, arr + e + 1);
		return arr[k - 1];
	}
};