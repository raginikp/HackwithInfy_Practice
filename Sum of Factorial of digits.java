import java.io.*;
import java.util.*;

public class Solution {
    static int fact (int a){
        if(a==0){
            return 1;
        } 
    return a*fact(a-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=9;i>=0;i--){
            while(n>=fact(i)){
                n=n-fact(i);
                res.add(i);
            }
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
        }
    }
}
