public class While
{
	public static void main (String args[])
	{
		System.out.print("\n" + "While Loop:" + "\n");
		While.alpha();

                System.out.print("\n" + "Do While Loop:" + "\n");
                While.beta();
	}
	public static void alpha ()
	{
		int beta = 1;
                while(beta < 10)
                {
                        System.out.print("num = " + beta + "\n");
                        beta++;
                }
	}
        public static void beta ()
        {
                int charlie = 11;
                do
                {
			System.out.print("num = " + charlie + "\n");
			charlie++;
                } while(charlie < 20);
        }
}
