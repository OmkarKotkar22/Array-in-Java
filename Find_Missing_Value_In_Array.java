/*Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/

import java.util.Scanner;
public class Find_Missing_Value_In_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size in Array: ");
		int size = sc.nextInt();
		
		int a[] = new int[size];

		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
                

		int max = a[0];
		int min = a[0];
		for(int i = 1; i < a.length; i++)
	   	{
	       		if(a[i] > max)
			{ 
				max = a[i];
			}
			if(a[i] < min){
				min = a[i];
			}
		}

		for(i = min; i< max; i++){
			boolean found = false;
			for(int j = 0; j < a.length; j++){
				if(a[j] == i){
					found = true;
					break;
				}
			}
			if(!found){
				System.out.print("Missing Elements:  ": i); 
			}
		}             		
	}
}