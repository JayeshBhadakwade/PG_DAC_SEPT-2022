import java.util.Scanner;


class p6{


public static void main(String args[]){

System.out.println("Enter the number");

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();

for(int i=1;i<=a;i++){

for(int j=1;j<=i-1;j++){

System.out.print(" ");

}
for(int j=a;j>=i;j--){
	 System.out.print("*");
	 
	  }
	  
	  for(int j=5;j>i;j--){
				
				System.out.print("*");
				
			}
System.out.println();


}


}


}
	
	
