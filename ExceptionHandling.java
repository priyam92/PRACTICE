package opps;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }
  
        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
    }
}
