//Input a string and print it in reverse
import java.util.*;

public class ReversedString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String reversed = new StringBuilder(str).reverse().toString();
    System.out.println("Reversed string " + reversed);

  }
}