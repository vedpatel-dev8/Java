import java.util.HashSet;

class CF02Hash
{
	public static void main(String [] args)
	{
		HashSet<String> hs = new HashSet<String>();
		
		System.out.println("Size of hashset: " + hs.size());

		hs.add("Jan");
		hs.add("Feb");
		hs.add("Mar");
		hs.add("Apr");
		
		System.out.println("HashSet Element: " + hs);
		System.out.println("Size of hashset: " + hs.size());
		System.out.println("Hashset contains Jan? : " + hs.contains("Jan"));
	
		for(String x: hs)
			System.out.println("Hash Element: " + x);
	}
}