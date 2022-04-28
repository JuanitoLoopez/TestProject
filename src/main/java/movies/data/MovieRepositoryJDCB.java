package movies.data;

import movies.model.Movie;

import java.util.Collection;

public class MovieRepositoryJDCB implements MovieRepository {
    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        return null;
    }

    @Override
    public void saveOrUpdate(Movie movie) {
    }
}
