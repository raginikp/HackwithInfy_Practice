import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        String prefix="";
        String suffix="";
        for(int i=0;i < s.length()-1;i++){
            prefix=prefix+s.charAt(i);
            suffix=s.charAt(s.length()-1-i)+suffix;
            if(prefix.equals(suffix)){
                str=prefix;
            }
        }
        System.out.print(str);
    }
}
