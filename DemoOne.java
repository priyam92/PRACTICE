//Flow of control in try/catch blocks
package opps;
public class DemoOne{
  public static void main(String args[])
		   {
			int x = 10;
			int y = 10;
			try{
			   int num= x/y;
			   System.out.println("next-statement: Inside try block");
			}
		        catch(Exception ex)
			{
			   System.out.println("Exception");
			}
			System.out.println("next-statement: Outside of try-catch");
		   }
		}