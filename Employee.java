package Inheritance;

public class Employee {
	int empID;
	String designation;
	double empSal;
	String empName;
	
	/*
	 * public Employee(int empid, String name, double sal, String designation) {
	 * 
	 * this.empID=empid; this.empName=name; this.sal=sal;
	 * this.designation=designation; }
	 */
	
	public void setInfo(int id, String nm, double sal, String dsg)
	{
		
		empID=id;
		empName=nm;
		empSal=sal;
		designation=dsg;
	}
	
	public void DisplayDetails() {
		System.out.println("Emp ID is " +empID);
		System.out.println("Emp Name is " +empName);
		System.out.println("Emp Salary is " +empSal);
		System.out.println("Emp Designation is " +designation);
		}
	
	public void work() {
		
		System.out.println("Work info and status");
	}
}
