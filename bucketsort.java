import java.io.*;
import java.util.*;

public class Solution {

    public static void bucketSort(float[] arr, int n) {
        if (n <= 0) return;

        List<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (float num : arr) {
            int bucketIndex = (int)(num * n);
            if(bucketIndex==n)
                bucketIndex=n-1;
            buckets[bucketIndex].add(num);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        bucketSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f", arr[i]);
            if (i < n - 1) System.out.print(" ");
            
        }
    }
}
