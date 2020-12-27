package App_Rating;

public interface RatingStatisticsCollector 
{
	public void putNewRating(String app, int rating);
	
	public double getAverageRating(String app);
	
	public int getRatingsCount(String app);
}
