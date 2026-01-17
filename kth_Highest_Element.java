/*find kth index value*/

public class kth_Highest_Element{
	public static void main(String x[])
	{
		int a[] = new int[]{10, 4, 20, 15, 3};
		int k =3;
		int kth = 0;
		int max = Integer.MIN_VALUE;
		int index = -1;

		for(int i = 0; i < k; i++)
		{
			max = Integer.MIN_VALUE;
			index = -1;
			for(int j = 0; j < a.length; j++)
			{
				if(a[j] > max)
				{
					max = a[j];
					index = j;
				}
			}
			a[index] = Integer.MIN_VALUE;
			kth = max;
		}
		System.out.println(k+ " th highest Element in Array: "+ kth);
	}
}