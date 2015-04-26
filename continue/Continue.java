public class Continue
{
	public static void main (String args[])
	{
		System.out.print("\n" + "Use Continue to skip over an item: (15)" + "\n");
		Continue.alpha();

                System.out.print("\n" + "Use Continue to count unique items: (www.jeremiahfaria.com)" + "\n");
                Continue.bravo();
	}
     	public static void alpha ()
        {
                int [] bravo = {5,10,15,20,25,30};
                for(int delta : bravo)
                {
			if (delta == 15) continue;
                        System.out.print("num = " + delta + "\n");
                }
        }
        public static void bravo ()
        {
		String charlie = "www.jeremiahfaria.com";
		int delta = charlie.length();
		int echo = 0;
		for(int foxtrot=0; foxtrot<delta; foxtrot++)
		{
			if(charlie.charAt(foxtrot) != 'a') continue;
			echo++;
		}
		System.out.print("Number of a's in the url is " + echo + "!\n\n");
        }
}
