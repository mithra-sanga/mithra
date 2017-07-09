import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int x1,x2,x3;
	Scanner s= new Scanner(System.in);
	x1=s.nextInt();
	x2=s.nextInt();
	x3=s.nextInt();
	if(x1>x2&&x1>x3)
	System.out.println("x1 is greatest");
	else if(x2>x3&&x2>x1)
	System.out.println("x2 is greatest"):
	else
	System.out.println("x3 is the greatest");
	}
}