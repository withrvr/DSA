// https://practice.geeksforgeeks.org/problems/reverse-a-string/1

#include <iostream>
#include <string>
using namespace std;
#define NEWLINE cout << endl;

string reverseWord(string str);

int main()
{
	string s = "hello";
	cout << reverseWord(s);
	NEWLINE;
	cout << s;
}

string reverseWord(string str)
{
	int n = str.length();
	int mid = n / 2;
	int j;
	int temp;

	for (short i = 0; i < mid; i++)
	{
		// cout << "swap " << (i + 1) << endl;
		j = n - 1 - i; // from which it is replaced
		// no need or start n end variables

		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
	return str;
}
