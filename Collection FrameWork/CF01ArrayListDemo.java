import java.util.ArrayList;

class CF01ArrayListDemo
{
	public static void main(String [] args)
	{
		ArrayList<String> arr = new ArrayList<String>();
		
		System.out.println("Size of Element: " + arr.size());

		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
	
		System.out.println("Array List Element: " + arr);
		System.out.println("Size of element: " + arr.size());

		arr.remove("B");
	
		System.out.println("ArrayList Element: " + arr);
		System.out.println("Index of c: " + arr.indexOf("C"));
		System.out.println("Element of index 0: " + arr.get(0));

		for(int i=0; i<arr.size(); i++)
		{
			System.out.println("Element: " + arr.get(i));
		}

		arr.set(0,"X");
		System.out.println("ArrayList Element: " + arr);
		
		for(int i=0; i<arr.size(); i++)
			System.out.println("Element: " + arr.get(i));
	
	}
}