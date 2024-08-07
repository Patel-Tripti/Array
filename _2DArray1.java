package Array;

import java.util.Scanner;

public class _2DArray1 {
    //multiplication of 2d array......
    public static void main(String[] args) {
        int a [][]=new int[2][2];
        int b [][]= new int [2][2];
        int c [][]= new int[2][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements od first array");

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("please enter the elememts of secound array");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
             b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            {
            c[i][j]=0;

            for(int k=0;k<a.length;k++){
             c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
            }
            }
        }
          for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
             System.out.print(c[i][j]+"\t");
            }
          }
          System.out.println();
        }
}
