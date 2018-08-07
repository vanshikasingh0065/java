import java.util.*;
class cmdl
{
   public static void main(String[] ar)
	{
		if(ar.length>0)
		{
		 System.out.println("The command line arguments are:");
 
                for (int i=0;i<5;i++)
                System.out.println(ar[i]);
		}
		else
		{
		 System.out.println("No command line arguments are found");
		}
	}
}