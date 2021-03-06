package movies.data;

import movies.model.Genre;
import movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class MovieRepositoryJDCB implements MovieRepository {
    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJDCB(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] args = {id};
        return jdbcTemplate.queryForObject("select * movies where id = ?", args, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {
        jdbcTemplate.query("select * from movies", movieMapper);
        return null;
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        jdbcTemplate.update("insert into movies (name, minutes, genre) values (?,?,?)",
                movie.getName(), movie.getMinutos(), movie.getGenre().toString());
    }
    private static RowMapper<Movie> movieMapper = new RowMapper<Movie>() {
        @Override
        public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Movie(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("minutes"),
                    Genre.valueOf(resultSet.getString("genre")));
        }
    };
}
