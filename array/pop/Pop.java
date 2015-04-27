import java.util.*;

public class Pop
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Pop last item off of Array:" + "\n");
                Pop.array();

		System.out.print("\n");
	}
        public static void array()
        {
                String[] items = {"alpha","bravo","charlie","delta","echo","foxtrot"};	
		String[] list = Arrays.copyOf(items,items.length-1);	

		for(String item : list)
                {
                        System.out.print("item = " + item + "\n");
                }
	}
}
