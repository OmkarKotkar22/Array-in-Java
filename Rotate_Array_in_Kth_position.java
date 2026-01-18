/*Rotate Array by using k value*/

import java.util.*;
public class Rotate_Array_in_Kth_position{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.print("Enter the Elements in Array: ");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		System.out.print("Enter the k value: ");
		int k = sc.nextInt();

		int [] temp = new int[size];
		int n = a.length;	
		k = k % n;
		int index = 0;

		for(int i = n- k; i < n; i++){
			temp[index++] = a[i];
		}

		for(int i = 0; i < n-k; i++){
			temp[index++] = a[i];
		}

		for(int i = 0; i < temp.length; i++){
			System.out.print(temp[i] + " ");
		}
	}
}