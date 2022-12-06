#include <iostream>

using namespace std;

#define NEWLINE cout << endl;

int arr[] = {11, 22, 33, 44, 55, 66, 77};
int rev[7];
int n = 7;

void printArray(int a[])
{
	for (short i = 0; i < n; i++)
		cout << a[i] << " ";

	NEWLINE;
}

// - - - main logic - - -
// adding one by one new from back
// to new array
// worst
void reverseArray()
{

	// worst without mid
	for (short i = 0; i < n; i++)
		rev[n - 1 - i] = arr[i];

	/*
	// with using mid
	short mid = n / 2;
	short j;

	rev[mid] = arr[mid];

	for (short i = 0; i < mid; i++)
	{
		j = n - 1 - i;

		rev[j] = arr[i];
		rev[i] = arr[j];
	}
	*/
}

int main()
{
	printArray(arr);
	printArray(rev);
	NEWLINE;
	reverseArray();
	NEWLINE;
	printArray(arr);
	printArray(rev);

	return 0;
}
