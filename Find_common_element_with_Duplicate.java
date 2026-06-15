import java.util.*;
public class Find_common_element_with_Duplicate{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a[] = {2, 5, 7, 2, 9, 5, 1};
		int count = 0;
		
		for(int i = 0; i < a.length; i++){
			count = 0;
			for(int j = 0; j  < a.length; j++){
				if(a[i] == a[j]){
					count++;
				}
			}
			

			if(count > 1){
				boolean flag = false;
				for(int k = 0; k < i; k++){
					if(a[k] == a[i]){
						flag = true;
					} 
				}
				if(!flag){
					System.out.print(a[i]+ " ");
				}
			}
		}
	}
}