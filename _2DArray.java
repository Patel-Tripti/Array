package Array;
import java.util.Scanner;
//addition of 2DArray......

public class _2DArray {
    public static void main(String[] args) {
        int arr1[][]= new int[3][3];
        int arr2[][]= new int [3][3];
        int res[][]= new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of  array");

        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
        arr1[i][j]= sc.nextInt(); 
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             arr2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             res[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print(res[i][j]+"\t");
            }
        }
        System.out.println();
    }
}
