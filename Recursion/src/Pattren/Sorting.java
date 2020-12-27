package Pattren;

public class Sorting {

	static int a[]= {111,4,33,2,6,23,8,8,2,9,0,5};
	static int i=0;
	static int j=0;
	static int imax=a.length-1;
	static int jmax=a.length-1;
	static int count=1;
	public static void main(String[] args) {
		
		print();
		for(int p:a)
			System.out.print(p+" ");
	}
	private static void print() {
		
		if(a[i]<a[j])//a[i]>a[j] && i<j
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		if(i<imax || j<jmax)
		{
			i=count/(jmax+1);
			j=count%(jmax+1);
			count++;
			print();
		}
	}

}
