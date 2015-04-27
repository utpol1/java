import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Reverse Array:" + "\n");
                Array.reverse();

		System.out.print("\n");
	}
        public static void reverse()
        {
                String[] items = {"alpha","bravo","charlie","delta","echo","foxtrot"};

		for(int i=items.length-1; i>=0; i--)
		{
			System.out.print("item = " + items[i] + "\n");
		}
        }
}
