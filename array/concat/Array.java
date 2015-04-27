import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Concatenate two Array's:" + "\n");
		Array.concat();
		
		System.out.print("\n");
	}
	public static void concat()
	{
		String[] a = {"alpha","bravo","charlie","delta","echo","foxtrot"};
		String[] b = {"golf","hotel"};

		List<String> array = new ArrayList<String>(Arrays.asList(a));
		array.addAll(Arrays.asList(b));
		
		Object[] concatenated = array.toArray();
		System.out.print(Arrays.toString(concatenated) + "\n");
	}
}
