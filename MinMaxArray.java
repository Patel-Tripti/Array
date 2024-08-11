class MinMaxArray {
    public static void main(String[] args) {
        int arr[] = {5, 4, 7,8 ,10};
        int temp =0;
         
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){

                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
          System.out.print(arr[i]+" ");
        }
        System.out.println("\nMinimum value is = "+arr[0]+"\nmaximum value is = "+arr[4]);
    }
}