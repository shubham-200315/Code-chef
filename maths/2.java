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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int temp = rev(n, 0);
     
    if (temp == n)
        System.out.println("wins");
    else
        System.out.println("loses" );
		    
		}
	}
	static int rev(int n, int temp)
	{
	    if(n==0)
	    {
	        return temp;
	    }
	   temp = (temp*10) + (n%10);
	   return rev(n / 10, temp);
	}
}
