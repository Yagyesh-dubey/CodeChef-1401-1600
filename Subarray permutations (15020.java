import java.io.*;
import java.util.*;
import java.util.stream.*;

/*
 */
class CodeChef {
  static void solve(PrintWriter out, Reader rd) throws Exception {
    int n = rd.nextInt();
    int k = rd.nextInt();
    if (n == 1) {
      out.println(1);
      return;
    } else if (k == 1) {
      out.println(-1);
      return;
    }
    for (int i = 1; i < k; i++) {
      out.print(i + " ");
    }

    for (int i = 0; i <= n - k; i++) {
      out.print((n - i) + " ");
    }
    out.println();
  }

  public static void main(String[] args) throws Exception {
    Reader rd = new Reader();
    PrintWriter out = new PrintWriter(System.out, false);
    int T = rd.nextInt();
    // int T = 1;
    for (int z = 0; z < T; z++) {
      solve(out, rd);
    }
    out.close();
  }

  static int log2(int a) {
    return (int) (Math.log(a) / Math.log(2));
  }

  static long binpow(long a, long b) {
    long res = 1;
    while (b > 0) {
      if ((b & 1) == 1)
        res *= a;
      a *= a;
      b >>= 1;
    }

    return res;
  }

  public static long gcd(long a, long b) {
    if (b != 0)
      return gcd(b, a % b);
    else
      return a;
  }

  public static long lcm(long a, long b) {
    long v = gcd(a, b);
    return (a * b) / v;
  }

  static class Pair {
    public long key;
    public long value;

    public Pair(long key, long value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public String toString() {
      return this.key + "=" + this.value;
    }
  }

  static class Reader {
    BufferedReader br;
    StringTokenizer st;

    Reader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    int nextInt() throws Exception {
      return Integer.parseInt(next());
    }

    long nextLong() throws Exception {
      return Long.parseLong(next());
    }

    long[] readLongArray(int n) throws Exception {
      long result[] = new long[n];
      for (int i = 0; i < n; i++) {
        result[i] = nextLong();
      }

      return result;
    }

    int[] readIntArray(int n) throws Exception {
      int[] result = new int[n];
      for (int i = 0; i < n; i++) {
        result[i] = nextInt();
      }
      return result;
    }

    HashSet<Integer> readSet(int n) throws Exception {
      HashSet<Integer> out = new HashSet<>();

      for (int i = 0; i < n; i++) {
        out.add(nextInt());
      }

      return out;
    }

    String nextLine() throws Exception {
      return br.readLine().trim();
    }

    String next() throws Exception {
      if (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
        }
      }

      return st.nextToken();
    }
  }
}
