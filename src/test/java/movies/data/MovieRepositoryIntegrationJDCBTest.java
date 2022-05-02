package movies.data;

import movies.model.Genre;
import movies.model.Movie;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class MovieRepositoryIntegrationJDCBTest {

    @Test
    public void load_all_movies() throws SQLException {
        DataSource dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE_MYSQL", "sa", "sa");
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql_scripts/test_data.sql"));
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        MovieRepositoryJDCB movieRepositoryJDCB = new MovieRepositoryJDCB(jdbcTemplate);
        Collection<Movie> movies = movieRepositoryJDCB.findAll();

        assertEquals(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR)),movies);
    }

}