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
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int one=0;
		    int zero=0;
		    while (n-->0){
		        int a=sc.nextInt();
		        if(a==1){
		            one++;
		        }else{
		            zero++;
		        }
		    }
		    int ans=Math.min(one,zero)+Math.max(0,one-zero)/3;
		    System.out.println(ans);
		}
	}
}
