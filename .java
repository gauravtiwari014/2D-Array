public class ArraySample1 {
		
		public void sample1DArray()
		{
			int arr1d[] = new int[10];
			//Populating elements of array
			for(int i=0;i<10;i++)
			{
				arr1d[i] = (i+1)*10;
			}
			System.out.println("Array elements displayed ...");
			for(int j=0;j<10;j++)
			{
				System.out.println(arr1d[j]);
			}
		}
		public void sample2DArray()
		{
			int arr2D[][] = new int[3][4];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
				{
					arr2D[i][j]= (i+j)*10;
				}
			}
			System.out.println("Displaying 2 D Array Elements ....");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
				{
					System.out.print(arr2D[i][j]+" ");
				}
				System.out.println();
			}
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ArraySample1 ars = new ArraySample1();
			//ars.sample1DArray();
			ars.sample2DArray();

		}

	}


	
