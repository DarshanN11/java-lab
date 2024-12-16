package labprogramsusn38.java;
import java.util.Scanner;

class employee{
	private int id;
	private String name;
	private int Salary;
	
	public employee(int id,String name,int Salary) {
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	public int raiseSalary(int percent)
	{
		return this.Salary+this.Salary*percent/100;
	}
}

public class Employeedemo {

	public static void main(String[] args) {
		Scanner Scanner =new Scanner(System.in);
		int id;
		String name;
		int Salary;
		System.out.println("enter employee id,name,Salary");
		id=Scanner.nextInt();
		name=Scanner.next();
		Salary=Scanner.nextInt();
		employee employee=new
				employee(id,name,Salary);
		System.out.println("enter percent raise");
		int percent =Scanner.nextInt();
		int raisedSalary=employee.raiseSalary(percent);
		System.out.println("Raised Salary:"+raisedSalary);

	}

}
