//Q3. Write a java program to find maximum and minimum number in array.

import java.util.Scanner;
public class Find_Max_Min_inarray
{
	public static void main(String x[])
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		for(int i = 1; i < a.length; i++)
	   	{
	       		if(a[i] > max)
			{ 
				max = a[i];
			}
		}
		System.out.println("Max value is  "+max);
	
		int min = a[0];
		for(int i = 1; i < a.length; i++)
	
	{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Min value is  "+min);
	}
}