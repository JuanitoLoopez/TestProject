package movies.data;

import movies.model.Genre;
import movies.model.Movie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class MovieRepositoryIntegrationJDCBTest {

    MovieRepositoryJDCB movieRepositoryJDCB;
    DataSource dataSource;

    /*"jdbc:h2:{ {.|mem:}[test] | [sql:]test_date.sql | {tcp|ssl}:[//]server[:port][,server2[:port]]/name }[;MODE=MYSQL...]"*/

    @Before
    public void set_up() throws SQLException {
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE_MYSQL", "sa", "sa");
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("testZZ/java/sql_scripts/test_data.sql"));
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        movieRepositoryJDCB = new MovieRepositoryJDCB(jdbcTemplate);
    }

    @Test
    public void load_all_movies() {
        Collection<Movie> movies = movieRepositoryJDCB.findAll();
        assertEquals(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR)),movies);
    }
    @Test
    public void load_movie_by_id() {
        Movie movie = movieRepositoryJDCB.findById(3);

        assertEquals(new Movie(3, "There's Something About Mary", 119, Genre.COMEDY),movie);
    }

    @Test
    public void insert_a_movie() {
        Movie movie =  new Movie("Super 8", 112, Genre.THRILLER);
        movieRepositoryJDCB.saveOrUpdate(movie);
        Movie movieFormDB = movieRepositoryJDCB.findById(4);
        assertEquals(new Movie(4, "Super 8", 112, Genre.THRILLER), movieFormDB);
    }

    @After
    public void tearDown() throws SQLException {
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");
    };
}