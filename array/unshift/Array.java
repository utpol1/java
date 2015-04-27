import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Add item to beginning of Array:" + "\n");
                Array.unshift();

		System.out.print("\n");
	}
        public static void unshift()
        {
                String[] items = {"alpha","bravo","charlie","delta","echo","foxtrot"};
	
		List<String> temp = new ArrayList<String>(Arrays.asList(items));
		temp.add(0,"Xray");
		items = temp.toArray(new String[temp.size()]);

		for(String item : items)
                {
                        System.out.print("item = " + item + "\n");
                }
	}
}
