package Pattren;

public class Star_pattren {

	static int i=0;
	static int j=0;
	static int imax=4;
	static int jmax=4;
	public static void main(String[] args) {
		
		print();
		
	}
	private static void print() {
		//System.out.println(i+" "+j);
		if(i+j<5)
			System.out.print("*");
		if(i<imax || j<jmax )
		{
			if(j<=jmax)
				j++;
			if(j>jmax)
			{
				System.out.println();
				j=0;
				i++;
			}
			print();
			
		}
	}

}
