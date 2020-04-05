package _05_netflix;

public class NetflixTester {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Hamilton", 5);
		Movie movie2 = new Movie("Harry Potter", 4);
		Movie movie3 = new Movie("Percy Jackson", 1);
		Movie movie4 = new Movie("The Tempest", 3);
		Movie movie5 = new Movie("Star Wars", 2);
		
		movie1.getTicketPrice();
		
		NetflixQueue movieQueue = new NetflixQueue();
		movieQueue.addMovie(movie1);
		movieQueue.addMovie(movie2);
		movieQueue.addMovie(movie3);
		movieQueue.addMovie(movie4);
		movieQueue.addMovie(movie5);
		movieQueue.sortMoviesByRating();
		movieQueue.printMovies();
		
		Movie bestMovie = movieQueue.getBestMovie();
		System.out.println("the best movie is " + bestMovie);
		System.out.println("the second best movie is " + movieQueue.getMovie(1));
	}
}
