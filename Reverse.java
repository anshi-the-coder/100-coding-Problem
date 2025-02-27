//Reverse an array.
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
      int [] arr = {10,20,30,40,50};
      int n= arr.length;
      for(int i=0;i<n/2;i++){
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
      }
      System.out.println("Reversed : "+ Arrays.toString(arr) );
  }
}