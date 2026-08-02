import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int X=sc.nextInt();
        Arrays.sort(arr);
        Set<String> result=new LinkedHashSet<>();
        for(int i=0;i<N-2;i++)
        {
            int left=i+1;
            int right=N-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==X){
                    result.add(arr[i]+" "+arr[left]+" "+arr[right]);
                    left++;
                    right--;
                }
                else if(sum<X){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        if(result.isEmpty())
        {
            System.out.println("No Triplet Found");
        }else
        {
            for(String triplet:result){
                System.out.println(triplet);
            }
        }
    }
}
