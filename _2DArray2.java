package Array;
//transpose of array....
public class _2DArray2 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,},{3,2,1},{4,5,6}};
        for(int i =0;i<arr.length;i++){
          for(int j =0;j<arr.length;j++){
           System.out.print(arr[j][i]+" ");
          }
          System.out.println();
        }
    }
}
