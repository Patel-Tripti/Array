class MinMaxArray {
    public static void main(String[] args) {
       int arr[] = {5, 4, 7,8 ,10};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
         if(arr[i]<min){          //arr[i]>max for find the maximum value
         min = arr[i];
         }
        }
         System.out.println("minimum value is = "+min);
    }
}
