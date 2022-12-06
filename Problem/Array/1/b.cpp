#include <iostream>

using namespace std;

#define NEWLINE cout << endl;

int arr[] = {11, 22, 33, 44, 55, 66, 77};
int n = 7;

void printArray()
{
	for (short i = 0; i < n; i++)
		cout << arr[i] << " ";

	NEWLINE;
}

// - - - main logic - - -
// start - end
// recursion
void reverseArray(short start, short end)
{
	if (start >= end)
		return;

	int temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;

	reverseArray(start + 1, end - 1);
}

int main()
{
	printArray();
	reverseArray(0, n - 1); // n-1 ************ because of index
	printArray();

	return 0;
}
