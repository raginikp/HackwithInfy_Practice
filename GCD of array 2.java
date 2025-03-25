import java.io.*;
import java.util.*;

public class Solution {
    int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Solution solution=new Solution();
        int res=a[0];
        for(int i=0;i<n;i++){
            res=solution.gcd(res,a[i]);
        }
        System.out.print(res);
    }
}
