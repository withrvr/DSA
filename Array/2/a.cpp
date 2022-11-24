#include <iostream>
#include <math.h>

using namespace std;

#define NEWLINE cout << endl;

int arr[] = {66, 44, 77, 55, 22, 11, 33};
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
	int min = int(INFINITY), max = int(-INFINITY);
	for (short i = 0; i < n; i++)
	{
		if (arr[i] < min)
			min = arr[i];

		if (arr[i] > max)
			max = arr[i];
	}

	cout << min;
	NEWLINE;
	cout << max;
	NEWLINE;
}

int main()
{
	printArray();
	reverseArray();
	printArray();

	return 0;
}
