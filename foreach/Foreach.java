public class Foreach
{
	public static void main (String [] args)
	{
		System.out.print("\n" + "Foreach Loop using String:" + "\n");
		Foreach.alpha();

                System.out.print("\n" + "Foreach Loop using Int:" + "\n");
                Foreach.bravo();
	}
	public static void alpha ()
	{
		String [] bravo = {"charlie","delta","echo","foxtrot"};
		for(String golf : bravo)
		{
			System.out.print("obj = " + golf + "\n");
		}
	}
        public static void bravo ()
        {
                int [] charlie = {5,10,15,20,25,30};
                for(int delta : charlie)
                {
                        System.out.print("num = " + delta + "\n");
                }
		System.out.print("\n");
        }
}
