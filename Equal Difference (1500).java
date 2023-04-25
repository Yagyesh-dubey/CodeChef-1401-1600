
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
/* Name of the class has to be "Main" only if the class is public. */
class ed
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int N=sc.nextInt();
		    HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
                    for(int i=0;i<N;i++)
                    {
                        int x=sc.nextInt();
                        mp.put(x,mp.getOrDefault(x,0)+1);
                    }
                    int a=0;
                    if(N>2)
                    {
                        int m=Integer.MIN_VALUE;
                        for(int i : mp.keySet())
                        {
                            if(mp.get(i)>m)
                                m=mp.get(i);
                        }
                        if(m==1)
                            a=N-2;
                        else
                            a=N-m;
                    }
                    System.out.println(a);
		}
	}
}
