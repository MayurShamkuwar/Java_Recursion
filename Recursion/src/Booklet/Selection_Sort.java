package Booklet;

public class Selection_Sort {

	static int a[]= {2,5,1,6,9,0,3,8};
	static int i=0;
	static int j=0;
	static int imax=a.length-1;
	static int jmax=a.length-1;
	public static void main(String[] args) {
		
		
		selectionSort();
		
		for(int p:a)
			System.out.print(p+" ");
		
		
		
	}
	private static void selectionSort() {
		int minindex=i;
			if(a[minindex]<a[j])
			{
				minindex=j;
			}
			int temp=a[minindex];
			a[minindex]=a[i];
			a[i]=temp;
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
				selectionSort();
			}
	}

}
