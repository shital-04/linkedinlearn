package Jan13;

public class ArrayOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] Students = {{"Aadi", "Pune"},{"Radhika","Mumbai"}};
		
		/*
		 * Students[0][0]="Aadi"; Students[0][1]="Pune";
		 * 
		 * Students[1][0]="Radhika"; Students[1][1]="Mumbai";
		 * 
		 * Students[2][0]="Advait"; Students[1][1]="Pune";
		 * 
		 * Students[3][0]="Akshata"; Students[3][1]="Pune";
		 * 
		 * Students[4][0]="Rohan"; Students[4][1]="Mumbai";
		 */
		
		for(int i=0,j=1; i<Students.length;i++) {
			
		if(Students[i][j]=="Pune") 
		System.out.println(Students[i][0] +" is from Pune");
		else
		System.out.println(Students[i][0] +" is from Mumbai");	
		
		}
		}
		
	
}


