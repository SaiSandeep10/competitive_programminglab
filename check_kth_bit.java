import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int mask = 1 << k;
        int result = (n & mask) != 0 ? 1 : 0;
        
        System.out.println(result);
    }
}
