//Count the occurrences of an element in an array.

import java.util.*;

public class CountTheOccurences {
    public static void main(String[] args) {
      int [] arr = {1,2,1,2,3,4};
      int target =2;
      int count = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
          count++;
        }
      }
       System.out.println(target + " appears " + count + " times.");

  }
}