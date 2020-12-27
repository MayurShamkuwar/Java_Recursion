package App_Rating;

import java.util.ArrayList;

public class RatingCollector implements RatingStatisticsCollector{
	
	ArrayList<AppName>list=new ArrayList<AppName>();
	
	
	
	public void putNewRating(String app, int rating)
	{
		list.add(new AppName(app,rating));
	}
	
	public double getAverageRating(String app)
	{
		double sum=0;
		double avg=0;
		int count=0;
		for (int i = 0; i <list.size(); i++) 
		{
			if(list.get(i).AppName.compareToIgnoreCase(app)==0)
			{
				sum=sum+list.get(i).rating;
				count++;
			}
		}
		avg=sum/count;
		return avg;
		
	}
	public int getRatingsCount(String app)
	{
		int count=0;
		for (int i = 0; i <list.size(); i++) 
		{
			if(list.get(i).AppName.compareToIgnoreCase(app)==0)
			{
				
				count++;
			}
		}
		return count;
		
	}

}
