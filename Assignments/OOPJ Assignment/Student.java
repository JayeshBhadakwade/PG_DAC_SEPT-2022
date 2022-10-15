import java.util.Scanner;

class Stud{
	
	String name;
	int Maths;
	int Science;
	int English;
	
	Stud(String n,int s1,int s2,int s3){
		name=n;
		Maths=s1;
		Science=s2;
		English=s3;	
	}
	
	void Totalavg(){
		
		int avg = ((Maths+Science+English)/3);
		System.out.println("Avg marks obtained : "+avg);
		
	}
	
	void display(){
		
		int Totmarks =(Maths+Science+English);
		System.out.println("Student name: "+name);
		System.out.println("Total marks: "+Totmarks);
		
		
	}
	
	
	
}




class Student{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Students name: ");
		String n = sc.nextLine();
		System.out.print("Maths marks: ");
		int s1 = sc.nextInt();
		System.out.print("Science marks: ");
		int s2 = sc.nextInt();
		System.out.print("English marks: ");
		int s3 = sc.nextInt();
		
		Stud s = new Stud(n,s1,s2,s3);
		
		s.Totalavg();
		s.display();
		
		
	}
	
	
}