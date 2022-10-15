import java.util.Scanner;

class MathOperation{
	
	
	
	static int add(int x,int y){
		 int add1 = x+y;
		 return add1;
		
	}
	static int substract(int x,int y){
		
		int sub1=x-y;
		return sub1;
	}
	
	
	static int multiply(int x,int y){
		int mult1=x*y;
		return mult1;
		
	}
	static int power(int x,int y){
		int pow1 = (int)Math.pow(x, y);	
		return pow1;
		
	}
	
	
}


 class Demo{
	
	public static void main(String args[]){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second number : ");
		int b = sc.nextInt();
		
		int ad = MathOperation.add(a,b);
		int sb =MathOperation.substract(a,b);
		int mu =MathOperation.multiply(a,b);
		int pow =MathOperation.power(a,b);
		
		System.out.println("Addition :"+a+" + "+b+ " = "+ad);
		System.out.println("Substraction :"+a+" - "+b+ " = "+sb);
		System.out.println("Multiplicatin :"+a+" * "+b+ " = "+mu);
		System.out.println("Power :"+a+" ^ "+b+ " = "+pow);
		
	}
	
}

/*
Enter First number : 5
Enter Second number : 2
Addition :5 + 2 = 7
Substraction :5 - 2 = 3
Multiplicatin :5 * 2 = 10
Power :5 ^ 2 = 25



*/