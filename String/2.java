/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		long t = sc.nextLong();
		while(t-->0)
		{
		   long integer_input = sc.nextLong();
		   String str = sc.next();
		   int str_length = str.length();
		   String str1 = str.substring(0,str_length/2);
		   String str2 = str.substring(str_length/2, str_length);
		   if(str1.equals(str2))
		   {
		       System.out.println("YES");
		   }
		   else{
		       System.out.println("NO");
		   }
		}
	}
}
