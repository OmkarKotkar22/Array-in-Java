/*7.Problem:
Replace First and Last Element with 0.
Input: [5, 3, 7, 2]
Output: [0, 3, 7, 0]*/

import java.util.*;
public class First_and_Last_ELement_0{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.print("Enter the Elements :");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		int i = 0;	
		int j = a.length-1;

		a[i] = 0;
		a[j] = 0;
		for(i = 0; i <a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}