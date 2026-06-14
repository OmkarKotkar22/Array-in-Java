/*6.Problem:
Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]*/

import java.util.*;
public class Divisible_by_3_replace_negative_Array{
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
			if(a[i] % 3 == 0){
				a[i] = -1;
			}
		}

		System.out.print("Display: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}