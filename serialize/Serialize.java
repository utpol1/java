import java.io.*;

public class Serialize
{
	public static void main(String args[])
	{
                System.out.print("\n" + "Serialize a String:" + "\n");
                Serialize.serialize();
   	
                System.out.print("\n" + "Deserialize a String:" + "\n");
                Serialize.deserialize();
	}
	public static void serialize ()
	{
                String [] alpha = {"bravo","charlie","delta"};
                try
                {
                        ByteArrayOutputStream echo = new ByteArrayOutputStream();
                        ObjectOutputStream foxtrot = new ObjectOutputStream(echo);
                        foxtrot.writeObject(alpha);
                        foxtrot.flush();
			System.out.print(echo.toString() + "\n\n");
	        }
                catch (Exception e)
                {
                        System.out.print(e + "\n");
                }
	}
	public static void deserialize ()
	{
                String golf = "";
                String [] alpha = {"bravo","charlie","delta"};
                try
                {
                        ByteArrayOutputStream echo = new ByteArrayOutputStream();
                        ObjectOutputStream foxtrot = new ObjectOutputStream(echo);
                        foxtrot.writeObject(alpha);
                        foxtrot.flush();
                        golf = echo.toString();

                        byte b[] = golf.getBytes();
                        ByteArrayInputStream bi = new ByteArrayInputStream(b);
                        ObjectInputStream si = new ObjectInputStream(bi);
                        //MyObject obj = (MyObject) si.readObject();

			System.out.print(si.readObject() + "\n\n");
                }
                catch (Exception e)
                {
			System.out.print(e + "\n");
                }
	}
}
