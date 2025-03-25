import java.io.*;
import java.util.*;

public class Solution {
    static int cave(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        return cave(row-1,col)+cave(row,col-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.print(cave(row,col));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
