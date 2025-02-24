//Check if a number is a multiple of 5.

import java.util.*;

public class Multiple {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a%5==0){
      System.out.println("Multiple of 5");
    }else{
      System.out.println("not a multiple of 5");
    }
  }
}