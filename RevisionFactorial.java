import java.util.*;

public class RevisionFactorial {
    public static void main(String[] args) {
     int fact = 1;
     int n=5;
     for(int i=1;i<=n;i++){
       fact= fact*i;
     }
     System.out.println(fact);
  }
}