import java.util.Scanner;


class p15{


public static void main(String args[]){

System.out.println("Enter the number");

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();

for(int i=1;i<=a;i++){

for(int j=1;j<=i;j++){
	
	if(j==1||j==i||i==a)
		
System.out.print("*");

else{
		System.out.print(" ");
	}

}

System.out.println();


}


}


}