package App_Rating;

public class AppName {

	String AppName;
	int rating;
	public AppName(String appName, int rating) {
		super();
		AppName = appName;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "AppName [AppName=" + AppName + ", rating=" + rating + "]";
	}
	
	
	
}
