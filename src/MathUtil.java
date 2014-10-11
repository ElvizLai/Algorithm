/**
 * Created by Elvizlai on 14-10-10.
 */
public class MathUtil {


    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (abs(t - c / t) > err * t)
            t = (c / t + t) / 2;
        return t;
    }

    public static double abs(double a) {
        if (a < 0) return -a;
        else return a;
    }

    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }
}
