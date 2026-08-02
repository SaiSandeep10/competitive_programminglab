import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        int count=0;
        while(N>0){
            count+=N&1;
            N>>=1;
        }
        System.out.println(count);
    }
}
