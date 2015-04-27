import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Add item to end of Array:" + "\n");
                Array.push();

		System.out.print("\n");
	}
        public static void push()
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
