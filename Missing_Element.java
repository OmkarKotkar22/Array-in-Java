/*Missing Element in Array*/

public class Missing_Element{
	public static void main(String args[])
	{
		int a[] = new int[]{25, 21, 23, 22};
		
		int min = a[0];
		int max = a[0];
		int actualSum = 0;

		for(int i = 0; i < a.length; i++)
		{
			actualSum = actualSum+a[i];
		
			if(a[i]<min)
			{
				min = a[i];
			}
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		int count = max - min +1;

		int expectedSum = count * (min + max) / 2;

		int missing =  expectedSum- actualSum;

		System.out.println("Missing Element in Array is: "+ missing);

	}
}