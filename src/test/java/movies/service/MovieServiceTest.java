package movies.service;

import movies.data.MovieRepository;
import movies.model.Genre;
import movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceTest {

    @Test
    public void return_movies_by_genre() {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
        new Movie(1, "Dark Knight", 152, Genre.ACTION),
        new Movie(2, "Memento", 113, Genre.THRILLER),
        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
        new Movie(4, "Super 8", 112, Genre.THRILLER),
        new Movie(5, "Scream", 111, Genre.HORROR),
        new Movie(6, "Home Alone", 103, Genre.COMEDY),
        new Movie(7, "Matrix", 136, Genre.ACTION),
        new Movie(8, "Dark Knight Returns", 152, Genre.ACTION),
        new Movie(9, "End Game", 150, Genre.ACTION)
                )
        );

        MovieService movieService = new MovieService(movieRepository);

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);

        List<Integer> movieIds = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());

        assertEquals(Arrays.asList(3,6), movieIds);
    }
}