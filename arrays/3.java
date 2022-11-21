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
		    int n= sc.nextInt();
		    int []arr = new int[n];
		    for(int i=0; i<arr.length;i++)
		    {
		        arr[i]= sc.nextInt();
		        
		    }
		    Arrays.sort(arr);
		  //  System.out.println(Arrays.toString(arr));
		    for(int j=0; j<arr.length;j++)
		    {
		        System.out.println(arr[j]);
		        
		    }
		  
		}
	
}
