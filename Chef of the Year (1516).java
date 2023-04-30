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
            int n = in.nextInt();
            int m = in.nextInt();
            HashMap<String, String> map = new HashMap<>();
            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(in.nextLine());
                map.put(st.nextToken(), st.nextToken());
            }

            HashMap<String, Integer> mapOfChefs = new HashMap<>();
            HashMap<String, Integer> mapOfCntr = new HashMap<>();
            String[] msg = new String[m];
            String cntr;
            for (int i = 0; i < m; i++) {
                msg[i] = in.nextLine();
                if (mapOfChefs.containsKey(msg[i])){
                    mapOfChefs.put(msg[i], mapOfChefs.get(msg[i]) + 1);
                }
                else{
                    mapOfChefs.put(msg[i], 1);
                }
                cntr = map.get(msg[i]);
                if (mapOfCntr.containsKey(cntr)){
                    mapOfCntr.put(cntr, mapOfCntr.get(cntr) + 1);
                }
                else{
                    mapOfCntr.put(cntr, 1);
                }
            }

            int maxCntr = Collections.max(mapOfCntr.values());
            ArrayList<String> country_max =new ArrayList<>();
            for(String s: mapOfCntr.keySet()){
                if (mapOfCntr.get(s) == maxCntr){
                    country_max.add(s);
                }
            }
            Collections.sort(country_max);
            String res_cntr = country_max.get(0);

            int maxChef = Collections.max(mapOfChefs.values());
            ArrayList<String> chef_max =new ArrayList<>();
            for(String s: mapOfChefs.keySet()){
                if (mapOfChefs.get(s) == maxChef){
                    chef_max.add(s);
                }
            }
            Collections.sort(chef_max);
            String res_chef = chef_max.get(0);
            out.println(res_cntr);
            out.println(res_chef);

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
