package opps;

public class PracticOne {
	 public static void main(String[] args) {
		   
		    try {
		      long data[] = new long[1000000000];
		    }
		    catch (Exception e) {
		      System.out.println(e);
		    }
		   
		    finally {
		      System.out.println("finally block will execute always.");
		    }
		  }
		}
