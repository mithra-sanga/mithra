import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,i,j;
		int c=0;
		Scanner s= new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		if(n1<n2)
		{		
		for(j=n1;j<=n2;j++)
		{
		for(i=0;i<j;i++)
		{
			if(j%i==0)
			c++;
		}
		if(c>2)
		System.out.println(+j);
		}
		}
		if(n1>n2)
		{		
		for(j=n2;j<=n1;j++)
		{
		for(i=0;i<j;i++)
		{
			if(j%i==0)
			c++;
		}
		if(c>2)
		System.out.println(+j);		
		}
		}
		
		
		
	}
}