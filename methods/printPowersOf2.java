/*
*	
*	Method that takes integer n as an argument
*	and prints n numbers that are powers of 2
*	to the console.
*	
*	Author: Ihar Simanovich
*	Date: 	04/21/2015
*	Assignment: 3.2 PracticeIt
*	
*/

public static void printPowersOf2(int n)
{
	int z = 1;						//first power of 2 is 1

	//for loop that goes through n
	//count of powers of 2
	for (int i = 0; i <= n; ++i)
	{
		System.out.print(z + " ");	//outputting power of 2
		z *= 2;						//incrementing power of 2
	}//end of for

	System.out.println();			//outputting blank line
}//enf of printPowersOf2
