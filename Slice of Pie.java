
import java.util.*;
public class Hell
{
	public static void main(String args[])
	{
		int b,i,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of people");
		a=sc.nextInt();
		System.out.println("Enter Number of slice");
		b=sc.nextInt();
		i=b/a;
		if(i == 0)
		{
			System.out.println("No slice left");
		}
		else
		{

			System.out.println("Each person gets "+i);	
		}
		
	}
}
	

