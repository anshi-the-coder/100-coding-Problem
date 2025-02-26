//Find the minimum number in an array.

import java.util.*;

public class Minimum {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 35, 89, 12}; 
        
        int min = numbers[0]; 
        
        for (int i = 1; i < numbers.length; i++) { 
            if (numbers[i] < min) {
                min = numbers[i]; 
            }
        }
        
        System.out.println("Minimum number: " + min);
  }
}