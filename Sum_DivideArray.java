package Array;
 class Sum_Divide {
    public static void main(String[] args) {
        int arr[]= {23,43,54,67,12};
        int c=arr.length;
        int sum=0;
        int div=0;
        for(int i=0;i<c;i++){
         sum=sum+arr[i];
         div = sum/5;
        
        } System.out.println("sum of array element= "+sum);
        System.out.println("Average of array elements is = "+div);
    }
}
