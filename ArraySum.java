//Calculate the sum of elements in an array.

import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 8, 1}; 
        
        int sum =0; 
        
        for (int i = 0; i < numbers.length; i++) { 
            sum+=numbers [i];
        }
        
        System.out.println("Sum of Array elements: " + sum);
  }
}