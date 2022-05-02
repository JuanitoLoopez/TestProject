package movies.model;

import java.util.Objects;

public class Movie {

    private Integer id;
    private String name;
    private int minutos;
    private Genre genre;

    public Movie(String name, int minutos, Genre genre){
        this(null, name, minutos, genre);
    }

    public Movie(Integer id, String name, int minutos, Genre genre){
        this.id = id;
        this.name = name;
        this.minutos = minutos;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return minutos == movie.minutos && Objects.equals(id, movie.id) && Objects.equals(name, movie.name) && genre == movie.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, minutos, genre);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
