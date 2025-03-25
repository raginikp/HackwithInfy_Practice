import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int sum=0;
        int max=a[0];
        for(int i=0;i<n;i++){
            sum=a[i];
            for(int j=i+1;j<n;j++){
                sum=sum+a[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.print(max);
    }
}
