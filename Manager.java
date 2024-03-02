package Inheritance;

public class Manager extends Employee {

	double bonus;
	/*
	 * public Manager(double bonus) {
	 * 
	 * this.bonus=bonus; }
	 */
	
	public void setBonus(double bonus) {
		
		this.bonus=bonus;
	}
	
	public void doAppraisals()
	{
		
		System.out.println("Appraisal process info");
	}
	public void doReviews()
	{
		System.out.println("Reviews process info");
	}
}
