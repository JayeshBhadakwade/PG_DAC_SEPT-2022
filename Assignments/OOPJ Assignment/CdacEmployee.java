abstract class Emplyoee{
	private int id;
	private String name;
	
	abstract double getSalary();
	
	void setid(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	void printdetails(){
		System.out.println(id);
		System.out.println(name);
		
		
	}
}

class RegularEmp extends Emplyoee{
	private double basicpay;
	private double salary;
	
	
	RegularEmp(){
	}
	RegularEmp(int id,String name,double basicpay){
		setid(id,name);
		this.basicpay=basicpay;
		
	}
	double getSalary(){
		salary=basicpay*1.7;
		return salary;
		
	}
	void printDetails(){
		printdetails();
		System.out.println(salary);
	}
}

abstract class ContractBasedEmp extends Emplyoee{
	private int noofyears;
	void getNoOfYears(){
		
	}
}
class CdacCBemp extends ContractBasedEmp{
	private double conSalary;
	double EmpSalary;
	CdacCBemp(int id,String name,double conSalary){
		setid(id,name);
		this.conSalary=conSalary;
	}
	double getSalary(){
		EmpSalary=conSalary*1.7;
		return conSalary;
	}
	void print(){
		printdetails();
		System.out.println(EmpSalary);
	}
}

class ThirdPartyEmp extends ContractBasedEmp{
	private double sal;
	double s;
	ThirdPartyEmp(int id,String name,double s){
		setid(id,name);
		this.s=s;
	}
	double getSalary(){
		sal=s*1.7;
		return sal;
	}
	void print1(){
		printdetails();
		System.out.println(sal);
	}
}

class CdacEmployee{
	public static void main(String args[]){
		RegularEmp te = new RegularEmp(1,"Harsh",50000);
		te.getSalary();
		te.printDetails();
		
		CdacCBemp re = new CdacCBemp(2,"Rohit",60000);
		re.getSalary();
		re.print();
		
		ThirdPartyEmp tp = new ThirdPartyEmp(3,"Mohit",90000);
		tp.getSalary();
		tp.print1();
	}
}