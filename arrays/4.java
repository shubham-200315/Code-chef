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
		int t= sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int [] arr = new int[n];
		    for(int i=0; i<n; i++)
		    {
		        arr[i]= sc.nextInt();
		    }
		  
		  //int [] arr = {1,2,3,3,4,4};
		    ArrayList<Integer> removeee = consecutive(arr);
		  //for(int k=0; k<removeee.size(); k++)
		  //{
		  //    System.out.println(removeee.get(k));
		  //}
		   int k= removeee.size();
		   System.out.println(k);
		   
// 		}
		
	}
	
	
 static ArrayList<Integer> consecutive (int []arr)
	{
	    ArrayList<Integer> removee = new ArrayList<>();
	    removee.add(arr[0]);
	    for(int i=1; i<arr.length; i++)
	    {
	        if(arr[i]!= arr[i-1])
	    {
	        removee.add(arr[i]);
	        
	    } 
	    }
	   return removee;
	    
	}
	
	
}
