package Booklet;

public class Transport_Matrix {

	static int[][]a= {{1,2},{3,4}};
	static int[][]b=new int [2][2];
	static int i=0;
	static int j=0;
	static int imax=a.length-1;
	static int jmax=a.length-1;
	public static void main(String[] args) {
			
		TransportMatrix();
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static void TransportMatrix() {
		
			b[i][j]=a[j][i];
		
		if(i<imax || j<jmax)
		{
			if(j<=jmax)
			{
				j++;
			}
			if(j>jmax)
			{
				i++;
				j=0;
			}
			TransportMatrix();
			}
		}

}
