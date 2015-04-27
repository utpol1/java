import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Join Array:" + "\n");
		Array.join();

		System.out.print("\n");
	}
	public static void join()
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
