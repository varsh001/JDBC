package jdbc;

public class Array1 {

	public static void main(String[] args) {
	   System.out.println("Start");
	   {
		   for (int i=1;i<=3;i++)
		   {
			   for (int j=3;j>=i;j--)
			   {
			   System.out.print("*");
			   }
			   System.out.println();
		   }
	   System.out.println("Stop");
	   }
	}
}


