/*8.Problem: Write a Java program to replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [ 10, 12, 15, 17, 20 ]
Output: [5, 12, 5, 17, 20 ]*/

import java.util.*;
public class Divisible_By_5_replace_5{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.print("Enter the Elements :");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length; i++){
			if(a[i] % 5 == 0){
				a[i] = 5;
			}
		}

		System.out.print("Display: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}