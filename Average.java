//Calculate the average of elements in an array.
import java.util.*;

public class Average {
    public static void main(String[] args) {
      int [] arr = {10,20,30,40};
      int sum = 0;
      for(int i=0;i<arr.length;i++){
        sum+= arr[i];
      }
      int average = sum/arr.length; //100/4=25
      System.out.println("Average : " +average);
  }
}