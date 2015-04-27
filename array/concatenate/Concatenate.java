import java.util.*;

public class Concatenate
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Concatenate two Array's:" + "\n");
		Concatenate.array();
		
		System.out.print("\n");
	}
	public static void array()
	{
		String[] a = {"alpha","bravo","charlie","delta","echo","foxtrot"};
		String[] b = {"golf","hotel"};

		List<String> array = new ArrayList<String>(Arrays.asList(a));
		array.addAll(Arrays.asList(b));
		
		Object[] concatenated = array.toArray();
		System.out.print(Arrays.toString(concatenated) + "\n");
	}
}
