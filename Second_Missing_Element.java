/*Q4. Write a program in java to find the smallest missing element from a sorted array?
		Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2*/


import java.util.*;
public class Second_Missing_Element{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.print("Enter the Elements : ");
		for(int i = 0; i < size; i++){
			a[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
			if(a[i] < min){
				min = a[i];
			}
		}
	
		int count = 0;
		boolean found = false;
		for(int i = min; i <= max; i++){
			found = false;
			for(int j = 0; j < a.length; j++){
				if(a[j] == i){
					found = true;
					break;
				}
			}

			if(!found){
				count++;
				if(count == 2){
					System.out.print("Second Missing Element: " + i);
					return;
				}	
			}
		}
		System.out.println("Second missing element not found.");
	}
}