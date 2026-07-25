import java.util.*;

public class Main {

    
    static long multiply(long a, long b) {
        long result = 0;

        while (b > 0) {
            if ((b & 1) == 1) {
                result += a;
            }
            a += a;
            b >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int a=dividend;
        int b= divisor;

        int low = 0, high = a;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (multiply(mid, b) <= a) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
