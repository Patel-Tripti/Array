package Array;

class OddElement {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9};
     int odd = arr[0];
     System.out.println("Odd element of array = ");
        for(int i=0;i<arr.length;i++)
        {
         
        if(arr[i]%2!=0)
        {
            odd = arr[i];
            // System.out.println(arr[i]);
            System.out.print(odd+" ");
        }
      
        }
    }
}
