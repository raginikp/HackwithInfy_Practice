import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int res=0;
        for(int i=1;i<=n;i++){
            res=(res+k)%i;
        }
        System.out.print(res+1);
    }
}
