import java.util.*;

public class Reverse
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Reverse Array:" + "\n");
                Reverse.array();

		System.out.print("\n");
	}
        public static void array()
        {
                String[] items = {"alpha","bravo","charlie","delta","echo","foxtrot"};

		for (int i=items.length-1; i>=0; i--)
		{
			System.out.print("item = " + items[i] + "\n");
		}
        }
}
