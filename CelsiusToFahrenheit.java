//Convert temperature from Celsius to Fahrenheit.
import java.util.*;
public class CelsiusToFahrenheit{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int celsius= 25;
    int Fahrenheit=(celsius*9/5)+32;
    System.out.println("celsius is "+ celsius);
    System.out.println("Fahrenheit is "+ Fahrenheit);
  }
}