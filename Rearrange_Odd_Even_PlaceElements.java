/*4.Problem:
Rearrange elements so even and odd elements alternate (same count assumed).
Input: [1, 2, 3, 4, 5, 6]
Output: [2, 1, 4, 3, 6, 5]
*/

import java.util.*;
public class Rearrange_Odd_Even_PlaceElements{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.print("Enter the Elements :");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < a.length-1; i=i+2){
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
		}

		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+ " ");
		}
	}
}