//Check if a number is even or odd.
import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a%2==0){
      System.out.println("no is even ");
    }else{
      System.out.println("no is odd");
    }
  }
}