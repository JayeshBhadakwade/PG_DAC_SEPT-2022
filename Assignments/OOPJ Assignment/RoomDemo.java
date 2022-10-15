import java.util.Scanner;

class Room{
	
	double height;
	double width;
	double breadth;
	
	
	Room(double h,double w,double b){
		height=h;
		width=w;
		breadth=b;
		
	}
	
	
	
	
	void volume(){
				
			double vol=(height*width*breadth);
			System.out.println("The Volume of Room is:"+vol);
		
	}
	
	
	
}





class RoomDemo{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the height :");
		double h = sc.nextDouble();
		System.out.print("Enter the width :");
		double w = sc.nextDouble();
		System.out.print("Enter the breadth :");
		double b = sc.nextDouble();
		
		
		Room r = new Room(h,w,b);
		r.volume();
		

	
	}
	
	
}