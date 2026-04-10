import java.util.ArrayList;

class CF03ArrayListN
{
	public static void main(String [] args)
	{

		ArrayList<Integer> arr = new ArrayList<Integer>();
	
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
	
		System.out.println("ArrayList Element: " + arr);

		int sum = 0;
		for(int x : arr)
			sum = sum + x;

		System.out.println("Sum: " + sum);

		Integer a[] = new Integer[arr.size()];
		arr.toArray(a);
	
		System.out.println("Array Element: ");
		for(int i = 0; i<a.length; i++)
			System.out.println("Element: " + a[i]);
	}
}
