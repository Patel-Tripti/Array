public class MissingEleArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3,5,6,7,10};
       int temp=0;
       int max =arr[0];
        for(int i=1;i<arr.length;i++)
        {
       if(max == arr[i]-1)
       {
         max = arr[i];
       }
       else{
        temp = max+1;
       }
        }
      System.out.println("Missing element in an array is = "+temp);
    }
}
