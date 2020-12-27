package Booklet;

public class Reverse_element_thirdVeriable {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= new int[a.length];
		
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				int temp=a[i];
				a[i]=b[j];
				b[j]=temp;
			}
		}
		
		for(int p:b)
			System.out.print(p+" ");
	}

}
