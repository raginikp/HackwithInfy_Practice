import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        
        int max=0;
        for(int i=0;i<size;i++){
              int min=a[i];
            for(int j=i+1;j<size;j++){
                if(a[j]-a[i]>max){
                    max=a[j]-a[i];
                }
            }
        }
        System.out.print(max);
    }
}
