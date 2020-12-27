package Booklet;

public class BinarySearch {

	static int[] a= {22,31,5,12,44,7,89};
	static int key=89;
	static int first=0;
	static int last=a.length;
	static int mid=(first+last)/2;
	static int i=0;
	static int j=0;
	static int imax=a.length-1;
	static int jmax=a.length-1;
	
	public static void main(String[] args) {
		
		sort();
		for(int p:a)
			System.out.print(p+" ");
		System.out.println();
		binarySearch();
		
	}

	private static void binarySearch() {
		if(first<=last)
		{	
			if(a[mid]<key)
			{
				first=mid+1;
				mid=(first+last)/2;
				binarySearch();
			}
			else if(a[mid]==key)
			{
				System.out.println("found at index "+mid);
			}
			else
			{
				last=mid-1;
				mid=(first+last)/2;
				binarySearch();
			}
			
		}
		if(first>last)
		{
			System.out.println("element is not found:");
		}
	}

	private static void sort() {
		
		if(a[i]>a[j] && i<j)
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
			sort();
		}
		
	}

	
}
