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
// Iterative
void reverseArray()
{
	short mid = n / 2;
	short j;
	int temp;

	for (short i = 0; i < mid; i++)
	{
		cout << "swap " << (i + 1) << endl;
		j = n - 1 - i; // from which it is replaced
		// no need or start n end variables

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

int main()
{
	printArray();
	reverseArray();
	printArray();

	return 0;
}
