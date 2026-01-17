Q1. Write a java program to find the unique value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 3, 20, 12, 10 


public class unique_Element{
	public static void main(String x[]){
		int a[] = {1,2,3,5,1,5,20,2,12,10};
		int visited[] = new int[a.length];
		for(int i = 0; i < a.length i++){
			for(int j = 0; j < a.length; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}	
		}

		for(int k = 0; k < a.length; k++){
			for(int l = k+1; l < a.length l++){
				if(a[k] != a[l]){
					visited[k] = a[k];
				}
			}
		}
		System.out.println(visited[i]);
	}
}