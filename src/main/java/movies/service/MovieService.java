package movies.service;

import movies.model.Movie;
import movies.data.MovieRepository;
import movies.model.Genre;

import java.util.Collection;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {

        Collection<Movie> allMovies = movieRepository.findAll();

        return allMovies;
    }
}
