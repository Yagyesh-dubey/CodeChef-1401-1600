/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int t = in.nextInt();
        while (t --> 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] cnt = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                sum += (arr[i]);
                cnt[arr[i] - 1]++;
            }
            if (cnt[0] == 0){
                out.println("Second");
                continue;
            }
            int flag = 0;
            int[] cum = new int[n];
            cum[0] = cnt[0];
            for (int i = 1; i < n; i++) {
                // counts the number of elements uptill 'i'
                cum[i] = cum[i - 1] + (cnt[i]);
                // If the current number 'i' doesnt exist in array then check if there is excess in prev
                if (cnt[i] == 0){
                    // if not there is no way of getting that number in the permutation (break)
                    if (cum[i - 1] <= i){
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 1){
                out.println("Second");
                continue;
            }
            // Valid array at this point
            long perm_sum = n; perm_sum *= (n + 1); perm_sum /= 2;
            if (perm_sum - sum < 0){
                out.println("Second");
                continue;
            }
            long diff = perm_sum - sum;
            if (diff % 2 == 0){
                out.println("Second");
            }
            else{
                out.println("First");
            }
        }
        out.close();
    }
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }
        public void println() throws IOException {
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
