package Sqr_of_index;

public class IndexWala {

	public static void main(String[] args) {
		int []a= {4,3,1,2,0};
		int max=16;
		int count=0;
		while(max!=0)
		{
			max=max/10;
			count++;
		}
		System.out.println(count);
		int mult=1;
		
		for (int i = 1; i <=count; i++) 
		{
			mult=10*mult;
			
		}
		System.out.println(mult);
		
		for (int i = 0; i < a.length; i++) 
		{
			int temp;
			if(a[a[i]]>100)
			{
				
				temp=a[a[i]]/mult;
			}
			else
			{
				temp=a[a[i]];
			}
		
		}
		
	}

}
