import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;
            for (int i = 0; i < 30; i++) {
                int m = 0;
                for (int j = 0; j < n; j++) {
                    m |= 1 << ((a[j] >> i) & 1);
                }
                if (m != 3) {
                    continue;
                }

                int t1 = x;
                if ((t1 & (1 << i)) != 0) {
                    t1 ^= 1 << i;
                    for (int j = i - 1; j >= 0; j--) {
                        t1 |= 1 << j;
                    }
                }

                ans = Math.max(ans, t1);
            }

            System.out.println(ans);
        }
    }
}
