//Input a number and print its square and cube.
import java.util.*;
public class SquareAndCube{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int square = a*a;
    int cub = a*a*a;
    System.out.println("square is : "+ square);
    System.out.println("cube is : "+ cub);
  }
}