//Find the maximum number in an array.

import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 35, 89, 12}; 
        
        int max = numbers[0]; 
        
        for (int i = 1; i < numbers.length; i++) { 
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }
        
        System.out.println("Maximum number: " + max);
  }
}