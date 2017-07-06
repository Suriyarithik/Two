# Two
import java.util.*;
public class Two
{
	public static void main(String[] args) 
	{
		int int1, int2, se=0;
		Scanner s = new Scanner(System.in);
		int1 = 0;
		int2 = 20;
		for (int i= int1; i<= int2; i++)
		{
		    if ( i %2 == 1 )
		    {
		    se=se+i;
		    }
		}
		System.out.println(se);
   }
} 
