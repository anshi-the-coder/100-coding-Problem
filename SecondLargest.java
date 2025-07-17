// import java.util.*;
// import java.util.Arrays;
//  class SecondLargest{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("Enter number of elements:");

//         int arr[]=new int[n];
//         System.out.println("Enter" + n + "numbers:");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Arrays.sort(arr);
//         int largest = arr[n - 1];
//         int secondLargest = -1;
//         for(int i = n - 2; i >= 0; i--) {
//             if(arr[i] != largest) {
//                 secondLargest = arr[i];
//                 break;
//     }
// }
//  if(secondLargest != -1) {
//             System.out.println("Second largest number is: " + secondLargest);
//         } else {
//             System.out.println("Second largest number not found (all numbers are same).");
//         }
//     }
// }

import java.util.*;
import java.util.Arrays;

class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // Sort the array

        System.out.println("Second largest number is: " + arr[1]);  // Print second largest

    }
}
