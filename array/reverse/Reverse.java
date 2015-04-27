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

		//int count = items.length(); 
                for(String item : items)
                {
                        System.out.print("item = " + item + "\n");
                }
        }
}
