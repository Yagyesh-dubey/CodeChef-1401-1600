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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
		    int p1=sc.nextInt(),q1=sc.nextInt(),p2=sc.nextInt(),q2=sc.nextInt();
		    long total=(x2-x1)*(y2-y1)+(p2-p1)*(q2-q1);
		    if((p1>=x2)||(q1>=y2)||(p2<=x1)||(q2<=y1))
		    {
		        System.out.println(total);
		        continue;
		    }
		    int[] a={x1,x2,p1,p2};
		    int[] b={y1,y2,q1,q2};
		    Arrays.sort(a);
		    Arrays.sort(b);
		    long len=(x2-x1)+(p2-p1)-(a[3]-a[0]);
		    long wid=(y2-y1)+(q2-q1)-(b[3]-b[0]);
            
		    System.out.println(total-(len*wid));
		}
	}
}
