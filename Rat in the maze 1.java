import java.io.*;
import java.util.*;

public class Solution {
    static void print(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean isvalid(int maze[][], int x,int y, int row,int col){
        return x>=0 && y>=0 && x<row && y<col && maze[x][y]==1;
    }
    static boolean solvemazeutil(int maze[][],int sol[][],int x,int y, int row,int col){
        if(x==row-1 && y==col-1 && maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }
        if(isvalid(maze , x,y,row,col)){
            sol[x][y]=1;
            if(solvemazeutil(maze,sol,x+1,y,row,col)){
                return true;
            }
            if(solvemazeutil(maze,sol,x,y+1,row,col)){
                return true;
            }
           sol[x][y]=0;
           return false;
            }
            return false;
        }
   static void solvemaze(int maze[][],int row,int col){
       int sol[][]=new int[row][col];
       if(!solvemazeutil(maze,sol,0,0,row,col)){
           System.out.print(-1);
           return;
       }
       else{
           print(sol);
       }
   }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int maze[][]=new  int[row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            maze[i][j]=sc.nextInt();
        }
    }
        solvemaze(maze,row,col);
        
    }
}
