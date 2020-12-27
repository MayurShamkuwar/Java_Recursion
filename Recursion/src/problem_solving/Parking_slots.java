package problem_solving;

public class Parking_slots {

	public static void main(String[] args) {
		int a[][]= {{5,10},{0,20},{20,40},{35,45}};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				if(a[i][j]<min)
					min=a[i][j];
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		int maxp=Integer.MIN_VALUE;
		
		
		for (int pt = min; pt < max; pt++)
		{
			int count=0;
			for (int i = 0; i < a.length; i++)
			{
				if(pt>=a[i][0] && pt<a[i][1])
				{
					count++;
				}
				if(maxp<count)
					maxp=count;
			}
		}
		System.out.println("parking slots:"+maxp);
	}

}
