package movies.service;

import movies.model.Movie;
import movies.data.MovieRepository;
import movies.model.Genre;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream().filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByDuration(int duration) {
        return  movieRepository.findAll().stream().filter(movie -> movie.getMinutos() <= duration).collect(Collectors.toList());
    }
    public Collection<Movie> findMoviesByName(String name) {
        return  movieRepository.findAll().stream().filter(movie -> movie.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public Collection<Movie> findMovieByTemplate(Movie template) {
        return movieRepository.findAll().stream().filter(movie -> movie.equals(template)).collect(Collectors.toList());
    }
}
