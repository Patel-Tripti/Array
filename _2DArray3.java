package Array;
//Spiral metrix....
public class _2DArray3 {
    public static void main(String[] args) {
         int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
             if(i==j){
            System.out.println(arr[i][j]);
             }
            }
         }
         System.out.println(" ");
    }
}
