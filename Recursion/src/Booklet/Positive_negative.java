package Booklet;

public class Positive_negative {

	static int a[]= {3,-5,2,0,-9,-1,4,7,-2,1,-3};
	static int i=0;
	static int j=0;
	static int imax=a.length-1;
	static int jmax=a.length-1;
	
	public static void main(String[] args) {
		
		positiveNegativ();
		for(int p:a)
			System.out.print(p+" ");
		
	}

	private static void positiveNegativ() {
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
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
					positiveNegativ();
				}
	}

}
