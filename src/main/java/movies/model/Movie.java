package movies.model;

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
}
