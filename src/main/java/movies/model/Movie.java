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
