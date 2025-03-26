import java.io.*;
import java.util.*;

public class Solution {
    static void gp( char ch[], int start ,int end){
        if(start==end){
            String str="";
            for(int i=0;i<ch.length;i++){
                str+=ch[i];
            }
            System.out.println(str);
            return;
        }
        else{
            for(int i=start;i<=end;i++){
                swap(ch,i,start);
                gp(ch,start+1,end);
                swap(ch,i,start);
            }
        }
    }
    static void swap(char ch[],int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        gp(s.toCharArray(),0,s.length()-1);
    }
}
