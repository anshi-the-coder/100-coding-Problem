//Find the largest of three numbers.


import java.util.*;

public class Largest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b && a>c){
      System.out.println("First largest number "+ a);
    }else if(b>c){
      System.out.println("Second largest number "+ b);
    }else{
      System.out.println("Third largest number " +c);
    }
  }
}