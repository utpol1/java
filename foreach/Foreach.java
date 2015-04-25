public class Foreach
{
	public static void main (String args[])
	{
		System.out.print("\n" + "Foreach Loop using String:" + "\n");
		Foreach.alpha();

                System.out.print("\n" + "Foreach Loop using Int:" + "\n");
                Foreach.beta();
	}
	public static void alpha ()
	{
		String [] beta = {"charlie","delta","echo","foxtrot"};
		for(String golf : beta)
		{
			System.out.print("obj = " + golf + "\n");
		}
	}
        public static void beta ()
        {
                int [] charlie = {5,10,15,20,25,30};
                for(int delta : charlie)
                {
                        System.out.print("num = " + delta + "\n");
                }
        }
}
