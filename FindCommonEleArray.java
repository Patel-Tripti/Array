public class FindCommonEleArray {
public static void main(String[] args) {
    int arr[]={1,4,6,8,10};
    int arr1[]={1,3,5,8,10};
    int count=0;
    for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr1.length;j++){

            if(arr[i]==arr1[j]){
                System.out.print(arr1[i] + " ");
                break;
        }
        }
        
    }
}
}
