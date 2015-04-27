import java.util.*;

public class Sort
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Sort Array:" + "\n");
                Sort.array();

		System.out.print("\n");
	}
        public static void array()
        {
                String[] items = {"bravo","delta","alpha","echo","foxtrot","charlie"};
	
		Arrays.sort(items);	
		for(String item : items)
                {
                        System.out.print("item = " + item + "\n");
                }
	}
}
