package App_Rating;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App_Rating {

	public static void main(String[] args)
	{
		RatingCollector obj=new RatingCollector();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the User:");
		int n=sc.nextInt();
		
		sc.nextLine();
		String s=sc.nextLine();
		
		String [] a=s.split(",");
		
		System.out.println("Enter the app and rating");
		for (int i = 0; i <a.length; i++)
		{
			
			String []s1=a[i].split(" ");
			int ne=Integer.parseInt(s1[1]);
			obj.putNewRating(s1[0], ne);
			
		}
		System.out.println(obj.list);
		
		Set<String> set=new HashSet<String>();
		
		for (int i = 0; i < obj.list.size(); i++) 
		{
			set.add(obj.list.get(i).AppName);
		}
		System.out.println(set);
		
		ArrayList<String> alist=new ArrayList<String>(set);
		
		for (int i = 0; i < alist.size(); i++) 
		{
			System.out.println(alist.get(i)+" "+obj.getAverageRating(alist.get(i))+" "+obj.getRatingsCount(alist.get(i)));
		}
		
	}

}
