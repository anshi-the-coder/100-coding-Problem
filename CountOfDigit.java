//Count the number of digits in a number.

import java.util.*;

public class CountOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(temp!=0){
          temp=temp/10;
          count++;
        }
        if(n==0){
          count=1;
        }
       System.out.println("Number of digits: " + count);

      
    }
}

