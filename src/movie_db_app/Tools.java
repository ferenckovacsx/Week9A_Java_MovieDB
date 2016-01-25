package movie_db_app;

import java.util.List;

public class Tools {
	
	public static String toXMLTag(String tagName, String value) {
		return "<" + tagName + ">" + value + "</" + tagName +">";
	}
	public static void getMovieTitles(List<Movie> movie){
		for (int i = 0; i < movie.size(); i++) {
			System.out.println(movie.get(0));
	}
}
}