/*Q8. Write a java program to display only non-zero values from an array.*/

import java.util.*;
public class Display_Non_Zero_Elements{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.print("Enter the Elements in Array: ");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}
		System.out.print("Non Zero Elements : ");
		for(int i = 0; i < a.length; i++){
			if(a[i] != 0){
				System.out.print(a[i] + " ");
			}
		}
	}
}