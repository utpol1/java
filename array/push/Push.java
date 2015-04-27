import java.util.*;

public class Push
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Add item to end of Array:" + "\n");
                Push.array();

		System.out.print("\n");
	}
        public static void array()
        {
                String[] items = {"alpha","bravo","charlie","delta","echo","foxtrot"};
	
		List<String> temp = new ArrayList<String>(Arrays.asList(items));
		temp.add(items.length,"Xray");
		items = temp.toArray(new String[temp.size()]);

		for(String item : items)
                {
                        System.out.print("item = " + item + "\n");
                }
	}
}
