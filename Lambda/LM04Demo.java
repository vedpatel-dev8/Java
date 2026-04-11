interface StringFunction
{
	String strConvert(String str);
}

class LM04Demo
{
	public static void main(String [] args)
	{
		// Convert into UpperCase
		StringFunction upper = (str) -> str.toUpperCase();
		System.out.println("UpperCase: " + upper.strConvert("hello"));

		// Convert into LowerCase
		StringFunction lower = (str) -> str.toLowerCase();
		System.out.println("LowerCase: " + lower.strConvert("HELLO"));
		
		// String Reverse
		StringFunction reverse = (str) ->
		{
			String rev = "";
			for(int i = str.length()-1; i >= 0; i--)
				rev = rev + str.charAt(i);
			return rev;
		};
		System.out.println("Reverse String: " + reverse.strConvert("Hello"));
	}
}