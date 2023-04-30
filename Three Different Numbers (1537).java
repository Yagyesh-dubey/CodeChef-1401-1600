/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / (gcd(a, b));
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String tT = br.readLine();
	    int test = Integer.parseInt(tT);
        long mod = 1000_000_007l;
        while (test-- > 0) {
            long a[]=new long[3];
            int i;
            long res=1;
            String temp=br.readLine();
            String arr[]=temp.split(" ");
            for(i=0;i<3;i++)
            {
                a[i]=Long.parseLong(arr[i]);
            }          
            Arrays.sort(a);
		    for(i=0;i<3;i++){
		        a[i]=a[i]-i;
		        if(a[i]==0){
		            res=0;
		        }
		        res=(res*(a[i]%mod))%mod;
		    }
            System.out.println(res);
        }
    }
}
