import java.util.*;

public class PrimeNumbers{
   public static void main(String arg[]){
      int i,counter, j;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number = ");
      int n = sc.nextInt();
      //n= 10;
      System.out.printf("Enter the n value is %d ", n);
      System.out.printf("\nPrime numbers between 1 to %d are ", n);
      for(j=2;j<=n;j++){
         counter=0;
         for(i=1;i<=j;i++){
            if(j%i==0){
               counter++;
            }
         }
         if(counter==2)
         System.out.print(j+" ");
      }
   }
}