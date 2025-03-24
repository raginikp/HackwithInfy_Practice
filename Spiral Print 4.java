import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();}  }
        
        int top=0;
        int left=0;
        int bottom=m-1;
        int right=n-1;
        
        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
                }
            top++;
            for(int i=top;i<=bottom;i++){
               System.out.print(a[i][right]+" ");}
                right--;
               
            
             if(top <= bottom){
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");}
                bottom--;
              }
          if(left <= right) {
            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");}
                left++;
              }
        }     
    }
        
}
