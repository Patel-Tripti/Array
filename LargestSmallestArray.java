public class LargestSmallestArray {
    public static void main(String[] args) {
        int arr[]={18,24,14,12,10,5};
        int temp=0;

        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
           if(arr[i]<arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
          }
          System.out.print(arr[i]+" ");
        } 
        System.out.println("\nLargest element is = "+arr[0]+"\nSmallest element is = "+arr[5]);
    }
}
