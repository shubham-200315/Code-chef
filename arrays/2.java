import java.util.*;

class java {
	public static void main (String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
		difficult(t);
		sc.close();
	}
	public static void difficult(int t)
	{
	    int count =0;
	    for(int i =0; i<t; i++)
	    {
	         Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int [] arr = new int[n];
	        for(int j =0; j<n;j++)
	        {
	            arr[j]= sc.nextInt();
	        }
	        for(int j=0; j<arr.length;j++)
	        {
	            if(arr[j]>=1000)
	            {
	               count++; 
	            }
	        }
	        System.out.println(count);
	        sc.close();
	    }
	    
	}
}
