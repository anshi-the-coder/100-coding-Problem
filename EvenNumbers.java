//Print all even numbers from 1 to N.
import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 2; i <= N; i += 2) {
            System.out.println(i);
        }
      
      
    }
}
