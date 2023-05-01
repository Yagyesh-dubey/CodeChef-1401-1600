/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner w = new Scanner(System.in);
		int t = w.nextInt();
		while(t -- > 0){
		    int n = w.nextInt();
		    int[] a = new int[n];
		    int[] b = new int[n];
		    long sum = 0;
		    int ea = 0 , eb = 0; 
		    for(int i =0;i<n;i++){
		        a[i] = w.nextInt();
		        sum += a[i];
		        if(a[i] % 2 == 0)   
		        ea ++;
		       
		    }
		    for(int i =0;i<n;i++){
		        b[i] = w.nextInt();
		        sum += b[i];
		        if(b[i] % 2 == 0)   
		        eb ++;
		        
		    }
		    
		    System.out.println((sum-(Math.abs(ea-eb))) /2);
		}
	}
}
