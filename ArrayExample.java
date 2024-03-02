package Jan13;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] intArr = new int[5]; //decalration
		int[][] multiD = new int[5][2];
		multiD[0][0]=10;
		multiD[0][1]=11;
		
		multiD[1][0]=20;
		multiD[1][1]=21;
		
		multiD[2][0]=30;
		multiD[2][1]=31;
		
		multiD[3][0]=40;
		multiD[3][1]=41;
		
		multiD[4][0]=50;
		multiD[4][1]=51;
		
		
		
		for(int i=0;i<5;i++)
		{
			
			for (int j = 0; j<2; j++)
				
				
			{
				
				
				System.out.print(multiD[i][j] +"\t");
				
			}
			System.out.println();
			
		}
		/*intArr[0]=77; //Initialization
		intArr[3]=80;
		intArr[4]=90;
		
		for(int i =0;i<intArr.length;i++) {
			
			System.out.println(intArr[i]);
		}*/
		
		

	}

}
