import java.util.Scanner;


class Box{
	
	double height;
	double width;
	double breadth;
	
	
	Box(double h1,double w1,double b1){
		height=h1;
		width=w1;
		breadth=b1;
		
	}
	
	
	void getVolume(){
		double vol = height*width*breadth;
		System.out.println("Volume of Box is "+vol);
	}
	
	void getArea(){
		
		double sa = (2*breadth*width+2*breadth*height+2*height*width);
		System.out.println("Surface Area of Box is "+sa);
	}
		

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height of a Box : ");
		double h = sc.nextDouble();
		System.out.print("Enter width of a Box : ");
		double w = sc.nextDouble();
		System.out.print("Enter breadth of a Box : ");
		double b = sc.nextDouble();
		
		Box box1 = new Box(h,w,b);
		
		box1.getVolume();
        
		box1.getArea();		
		
	}
}


/*Enter height of a Box : 2
Enter width of a Box : 3
Enter breadth of a Box : 5
Volume of Box is 30.0
Surface Area of Box is 62.0*/