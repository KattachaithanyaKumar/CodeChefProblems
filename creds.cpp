/*
Problem
In the current semester, you have taken XX RTP courses, YY Audit courses and ZZ Non-RTP courses.

The credit distribution for the courses are:

44 credits for clearing each RTP course.
22 credits for clearing each Audit course.
No credits for clearing a Non-RTP course.
Assuming that you cleared all your courses, report the number of credits you obtain this semester.
*/


#include<iostream>
using namespace std;

int main()  {
	int tests;
	cin >> tests;
	
	int res[tests];
	
	for (int t = 0; t < tests; t++)  {
		int x, y, z;
		cin >> x >> y >> z;
		
		res[t] = (x * 4) + (y * 2);
	}
	
	for (int i : res)  {
		cout << i << endl;
	}
	
	return 0;
}
