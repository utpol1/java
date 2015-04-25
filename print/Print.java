public class Print 
{
	public static void main (String[] args)  
	{
		System.out.print("\n" +  "public static void main" + "\n");
		new Print().alpha();
		Print.beta();
	}
        public void alpha ()
        {
                System.out.println("\n" +  "public void alpha");
        }
        public static void beta ()
        {
                System.out.println("\n" +  "public static void beta" + "\n");
        }
}
