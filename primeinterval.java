import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,i;
		int c=0;
		Scanner s= new Scanner(System.in);
		n1=s.nextInt();
		n1=s.nextInt();
		if(n1<n2)
		{		
		for(i=n1;i<n2;i++)
		{
			if(n%i==0)
			c++;
		}
		}
		if(n1>n2)
		{		
		for(i=n2;i<n1;i++)
		{
			if(n%i==0)
			c++;
		}
		}
		if(c>2)
		System.out.println("The number is not a prime");
		else
		System.out.println("The number is prime");
		
		
	}
}