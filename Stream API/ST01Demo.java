import java.util.ArrayList;

class ST01Demo
{
	public static void main(String [] args)
	{
		ArrayList<Integer> no = new ArrayList<Integer>();
		
		no.add(5);
		no.add(4);
		no.add(7);
		no.add(1);
		no.add(6);
		no.add(3);
		no.add(2);
		
		System.out.println("Element: " + no);
		
		no.stream()
			.filter(n -> n%2 == 0)
			.map(n -> n*10)
			.forEach(n -> System.out.println(n));
			
		// What if map is first and second is filter
		no.stream()
			.map(n -> n*10)
			.filter(n -> n%2 == 0)
			.forEach(n -> System.out.println(n));
	}
}