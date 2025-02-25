//Print all odd numbers from 1 to N.

import java.util.*;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i=i+2) {
            System.out.println(i);
        }
      
      
    }
}
