public class Continue
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Use Continue to skip over an item: (15)" + "\n");
		Continue.skip();
		
		System.out.print("\n" + "Use Continue to count unique items: (www.jeremiahfaria.com)" + "\n");
		Continue.unique();
	}
	public static void skip()
	{
		int[] numbers = {5,10,15,20,25,30};
		for(int number : numbers)
		{
			if (number == 15) continue;
			System.out.print("number = " + number + "\n");
		}
	}
	public static void unique()
	{
		String string = "www.jeremiahfaria.com";
		int length = string.length();
		int count = 0;
		for(int i=0; i<length; i++)
		{
			if(string.charAt(i) != 'a') continue;
			count++;
		}
		System.out.print("Number of a's in the url is " + count + "!\n\n");
	}
}
