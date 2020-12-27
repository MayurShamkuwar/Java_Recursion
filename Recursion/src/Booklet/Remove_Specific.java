package Booklet;

public class Remove_Specific {

	static int a[]={1,2,3,4,5,6,7,8};
	static int b=6;
	static int i=0;
	static int j=0;
	static int imax=a.length-1;
	static int jmax=a.length-1;
	
	
	public static void main(String[] args) {
		
		RemoveSpecific();
	}

	private static void RemoveSpecific() {
				if(i<imax)
				{
					if(a[i]!=b)
						System.out.print(a[i]+" ");
					if(i<=imax)
					{
						i++;
					}
					RemoveSpecific();
				}
	}

}
