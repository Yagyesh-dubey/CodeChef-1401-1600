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
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    long m=s.nextLong(),n=s.nextLong();
		    if((m==1 || n==1)){
		        System.out.println((m==2 || n==2)?"Yes":"No");
		        continue;
		    }
		    System.out.println((m%2==1 && n%2==1)?"No":"Yes");
		}
	}
}
