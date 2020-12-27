package Booklet;

public class Pairs {

	static int[]a= {1,2,3};
	static int count=0;
	public static void main(String[] args) {
		
		Pairs(0,0);
		System.out.println(count);
		
	}
	private static int Pairs(int i, int j) {
		System.out.println("("+a[i]+","+a[j]+")");	
		count++;
		if(i<a.length-1 || j<a.length-1)
		{
			if(j<=a.length-1)
			{
				j++;
			}
			if(j>a.length-1)
			{
				i++;
				j=0;
				
			}
			Pairs(i, j);
		}
		return count;
	}

}
