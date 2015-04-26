public class While
{
	public static void main (String args[])
	{
		System.out.print("\n" + "While Loop:" + "\n");
		While.alpha();

                System.out.print("\n" + "Do While Loop:" + "\n");
                While.bravo();
	}
	public static void alpha ()
	{
		int bravo = 1;
                while(bravo < 10)
                {
                        System.out.print("num = " + bravo + "\n");
                        bravo++;
                }
	}
        public static void bravo ()
        {
                int charlie = 11;
                do
                {
			System.out.print("num = " + charlie + "\n");
			charlie++;
                } while(charlie < 20);
		System.out.print("\n");
        }
}
