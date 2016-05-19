/*
*	
*	Method that takes integer count as an argument
*	and prints fibonacci sequence of "count" numbers
*	to the console.
*	
*	Author: Ihar Simanovich
*	Date: 	04/24/2015
*	Assignment: 2.3 PracticeIt
*	
*/

public static void fibonacci(int count) 
{
	int a = 0;		//first number
	int b = 1;		//second number

		//for loop that goes through numbers
		//from 0 to COUNT
		for (int i = 0; i < count; i++)
		{
			a += b;						//adding second value to the first
			System.out.print(a + " ");	//outputting value of the sequence
			b = a-b;					//assigning first value minus second to second value
		}//end of for loop
}//end of fibonacci




