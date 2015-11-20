/* Name: Ihar Simanovich
 * Date: 04/24/2015
 * CS 210
 * Chapter 2 Exam
 */

public class Chapter2 {

//	public static void main(String[] args)
//	{
//		fibonacci();
//		stars();
//		slant();
//
//	}
	
	//method that produces fibonacci numbers
	public static void fibonacci()
	{
		int a = 0;//first number
		int b = 1;//next number
		
		//loop that adds up numbers and prints them
		for(int i = 0; i < 12; i++)
		{
			a = a + b;
			System.out.print(a + " ");
			b = a - b;
		}
		System.out.println();
		
	}
	
	//method that produces stars
	public static void stars()
	{
		//outer loop that produces required amount of lines
		for(int i = 1; i <= 5; i++)
		{
			//inner loop that produces required number of "*" repetitions
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//method that produces slant of numbers
	public static void slant()
	{
		//outer loop that produces required amount of lines 
		//prints a number at the end of line
		for(int i = 1; i <= 5; i++)
		{
			//inner loop that produces required amount of spaces
			for(int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			System.out.println(i);
			
		}
		
	}

}
