/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
		    int n  = Integer.parseInt(br.readLine().trim());
		    int arr[]  = new int[n];
		    String line = br.readLine(); // to read multiple integers line
            String[] strs = line.split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            
            long  sum = 0;
            for(int i = 0  ; i < n ;i++){
                sum += (arr[i]-1);
            }
            System.out.println(sum+1);
            
		}
	}
}
