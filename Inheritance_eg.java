package javapgm;
import java.util.*;
class Employee {
	String name;
	int Age;
	String Ph_no;
	String Address;
	double Salary;
	
	public void Print_Salary() {
		System.out.println("Salary = " +Salary	);
	}
}

class Officer extends Employee{	
	String specialization;
}
class Manager extends Employee{
	String department;
}
public class Inheritance_eg {
	public static void main (String [] args) {
			Scanner sc = new Scanner(System.in);
			
			Officer of = new Officer();
			System.out.println("Enter the Officer Details:");
			System.out.println("Officer Name:");
			of.name = sc.nextLine();
			System.out.println("Officer Age:");
			of.Age = sc.nextInt();
			System.out.println("Officer Phone Number:");
			of.Ph_no = sc.nextLine();
			sc.nextLine();
			System.out.println("Officer Address:");
			of.Address = sc.nextLine();
			System.out.println("Officer Salary:");
			of.Salary = sc.nextDouble();
			System.out.println("Officer specialization:");
			of.specialization = sc.nextLine();
			sc.nextLine();
			
			Manager mn = new Manager();
			System.out.println("Enter the Manager Details:");
			System.out.println("Manager Name:");
			mn.name = sc.nextLine();
			System.out.println("Manager Age:");
			mn.Age = sc.nextInt();
			System.out.println("Manager Phone Number:");
			mn.Ph_no = sc.nextLine();
			sc.nextLine();
			System.out.println("Manager Address:");
			mn.Address = sc.nextLine();
			System.out.println("Manager Salary:");
			mn.Salary = sc.nextDouble();
			System.out.println("Manager Department:");
			mn.department = sc.nextLine();
			
			System.out.println("----------Officer Details----------");
			System.out.println("Officer Name: " +of.name);
			System.out.println("Officer Age: " +of.Age);
			System.out.println("Officer Phone Number: " +of.Ph_no);
			System.out.println("Officer Address: " +of.Address);
			System.out.println("Officer Salary: " +of.Salary);
			System.out.println("Officer Specialization: " +of.specialization);
			
			System.out.println("----------Manager Details----------");
			System.out.println("Manager Name: " +mn.name);
			System.out.println("Manager Age: " +mn.Age);
			System.out.println("Manager Phone Number: " +mn.Ph_no);
			System.out.println("Manager Address: " +mn.Address);
			System.out.println("Manager Salary: " +mn.Salary);
			System.out.println("Manager Department: " +mn.department);
			
			sc.close();
			
	}
}
