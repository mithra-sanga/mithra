
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	char c;
Scanner sc=new Scanner(System.in);
c= sc.next().charAt(0);
if(Character.isLetter(c))
System.out.println("Its alphabet");
	else
	System.out.println("Its not an alphabet");
	}
}