//Input a number and check if it is positive, negative, or zero.
import java.util.*;
public class Number{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a>0){
      System.out.println("number is positive");
    }
    else if(a<0){
      System.out.println("number is negative");
    }else{
      System.out.println("number is zero");
    }
  }
}