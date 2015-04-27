import java.util.*;

public class Join
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Join Array:" + "\n");
		Join.array();

		System.out.print("\n");
	}
	public static void array()
	{
		StringBuffer buffer = new StringBuffer();

                String[] items = {"alpha","bravo","charlie","delta","echo","foxtrot"};
		String delimiter = "#";

                for(String item : items)
                {
        		buffer.append(item);
        		buffer.append(delimiter);
                }

		System.out.print(buffer.toString() + "\n");
	}
}
