package Booklet;

public class Sum_ofArray {

	static int a[]= {1,2,3,4,5};
	static int sum=0;
	public static void main(String[] args) {
		
		
		sumOfDigit(0);
		int total=sum;
		System.out.println(sum);
		System.out.println("avg:"+sum/a.length);
	}
	private static int sumOfDigit(int i) {
				if(i<a.length)
				{
					sum=sum+a[i];
					++i;
					sumOfDigit(i);
					
					
				}
				return sum;
	}

}
