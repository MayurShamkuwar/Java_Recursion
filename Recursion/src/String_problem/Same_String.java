package String_problem;
//Anagram String 
public class Same_String {

	static String [] s1= {"abc","as","rank","a","xzy","ghjgfdhjgdsfjh"};
	static String [] s2= {"abc","as","rank","a","xzy","ghjgfdhjgdsfjh","nark","sa","sdygydgydsg"};
	boolean flag=true;
	
	public static void main(String[] args) {
		sort(s1,0);
		sort(s2,0);
		for(String p:s1)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		for(String p:s2)
		{
			System.out.print(p+" ");
		}
		

		
	}

	private static void sort(String[] s12, int i) {
				if(i<s1.length)
				{
					char[] a=s1[i].toCharArray();
					a=sortCharArray(a,0,0);
					String s3=new String(a);
					s1[i]=s3;
					sort(s1,++i);
				}
	}

	private static char[] sortCharArray(char[] a, int i, int j) {
		
		if(i<=a.length-1 && j<=a.length-1)
		{
			if(a[i]>a[j] && i<j)
			{
				char temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			if(j<=a.length-1)
			{
				j++;
			}
			if(j>a.length-1)
			{
				j=0;
				i++;
			}
			sortCharArray(a, i, j);
		}
		
		
		return a;
	}

}
