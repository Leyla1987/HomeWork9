import java.util.Objects;

public class Book {
    private String title;
    private int publishDate;
    private Autor autor;

    public Book(String title, int publishDate, Autor autor) {
        this.title = title;
        this.publishDate = publishDate;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public Autor getAutor() {
        return autor;
    }



    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishDate == book.publishDate && title.equals(book.title) && autor.equals(book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate, autor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", autor=" + autor +
                '}';
    }
}

