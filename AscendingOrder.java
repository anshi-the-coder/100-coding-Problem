import java.util.*;
class AscendingOrder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter" + n + "elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          boolean isSorted = true;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
    }
}
 if(isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted in ascending order.");
        }
    }
}