/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class a
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    Arrays.sort(b);
		    long ans=0;
		    for(int i=0;i<n;i++){
		        ans=Math.max((a[i]+b[n-i-1]),ans);
		    }
		    System.out.println(ans);
		}
	}
}
