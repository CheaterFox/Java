import java.util.Date;

public class Book implements Comparable<Book>{
    private String name;
    private int totalPages;
    private String author;
    private int releaseDate;

    public Book(String name, int totalPages, String author, int releaseDate) {
        this.name = name;
        this.totalPages = totalPages;
        this.author = author;
        this.releaseDate = releaseDate;
    }
    @Override
    public int compareTo(Book b) {
        return getName().compareTo(b.getName());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
