/*5.Problem:
Replace all negative numbers in the array with 0.
Input: [2, -3, 4, -1, 5]
Output: [2, 0, 4, 0, 5]
*/

import java.util.*;
public class Replace_Negative_Element_with_Zero{
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
			if(i % 2 ==1){
				a[i] = 0;
			}
		}

		System.out.print("Display: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}