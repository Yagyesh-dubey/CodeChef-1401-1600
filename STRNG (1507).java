/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a % b);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int prev[]=new int[n];
		    int next[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(i==0){
		            next[i]=arr[i];
		        }else{
		            next[i]=gcd(next[i-1],arr[i]);
		        }}
		    for(int i=n-1;i>=0;i--){
		        if(i==n-1){
		            prev[i]=arr[i];
		        }else{
		            prev[i]=gcd(prev[i+1],arr[i]);
		        }}
		        for(int i=0;i<n;i++){
		            if(i==0){
		                if(prev[i+1]!=1){
		                    count++;
		                    continue;
		            }}
		            else if(i==n-1){
		                if(next[i-1]!=1)
		                    count++;{
		                    continue;
		            }}
		            else{if(gcd(next[i-1],prev[i+1])!=1)count++;}
		        }
		        System.out.println(count);
		  
		}
	}
}
