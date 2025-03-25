import java.io.*;
import java.util.*;

public class Solution {
    static Set<String> set=new HashSet<>();
    static void expand(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
       set.add(s.substring(l+1,r));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        
        for(int i=0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        int max=0;
        String str="";
        for(String ele:set){
            if(ele.length()>max){
                max=ele.length();
                str=ele;
            }
        }
        System.out.print(str);
    }
}
