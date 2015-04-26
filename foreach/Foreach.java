public class Foreach
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Foreach Loop using String:" + "\n");
		Foreach.string();
		
		System.out.print("\n" + "Foreach Loop using Int:" + "\n");
		Foreach.integer();
	}
	public static void string()
	{
		String[] items = {"alpha","bravo","charlie","delta","echo","foxtrot"};
		for(String item : items)
		{
			System.out.print("item = " + item + "\n");
		}
	}
	public static void integer()
	{
		int[] numbers = {5,10,15,20,25,30};
		for(int number : numbers)
		{
		        System.out.print("number = " + number + "\n");
		}
		System.out.print("\n");
	}
}
