import java.util.*;
import java.lang.*;
import java.io.*;
 class Codechef{
    static class V_FastReader{
        BufferedReader br;
        StringTokenizer st;
        public V_FastReader(){
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
    static class V_FastWriter {
		private final BufferedWriter bw;

		public V_FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            V_FastReader vin=new V_FastReader();
            V_FastWriter vout = new V_FastWriter();
            
//******************************************************************************         
    int testCases=vin.nextInt();
    while(testCases-- > 0)
    {
        // write code here bonappetit !!
        int v=vin.nextInt();
        int d=(int)Math.pow(2,v);
        int n=0;
        for(int i=1;i<=v;i++)
        {
            n*=2;
            if(i%2==1) n+=1;
            else n-=1;
        }
        vout.print(n+" "+d+" ");
    }
            
//******************************************************************************         
            vout.close();
        } catch (Exception e) {
            return;
        }
    }
}
