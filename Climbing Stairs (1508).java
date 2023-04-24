/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;  

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            FastReader sc = new FastReader();
            int tests = sc.nextInt();
            int[] fibArray = new int[1000001];
            pouplateFib(1000001,fibArray);
            while (tests-- > 0) {
                int n = sc.nextInt();
                int g = sc.nextInt();
                
                int fib = fibArray[n-1];
               // String s = String.valueOf(fib);
                //System.out.println(s);
               
                while(fib>0){
                    if((fib&1)==1){
                        g--;
                    }
                    fib=fib>>1;
                }
                System.out.println(g==0?"CORRECT":"INCORRECT");
               
                
               // System.out.println(set.size());
                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void pouplateFib(int n,int[] fib){
        int M = 1000000007;
       
        
        
        fib[0]=1;
        fib[1]=2;
        for(int i=2;i<n;i++){
            fib[i]=(fib[i-1]+fib[i-2])%M;
        }
        
        
    }
    
    private static boolean isPalindrome(int num){
        int x = 0;
        int number = num;
        while(num>0){
            int mod = num%10;
            x = x*10 + mod;
            num/=10;
        }
        //System.out.println(x)
        return x==number;
    }
    private static int[] readIntArray(int n,FastReader sc){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    
     private static long[] readLongArray(int n,FastReader sc){
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        return arr;
    }
    
    private static long gcd(long a,long b){
        long max = Long.max(a,b);
        long min = Long.min(a,b);
        if(min==0){
            return 1;
        }
        long mod = max%min;
        while(mod!=0){
           max = b;
           min = mod;
           mod=max%min;
        }
        return min;
    }
    
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
