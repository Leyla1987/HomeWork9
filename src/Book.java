
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
        public String toString() {
            return "Книга - " + title +
                    ", дата публикации - " + publishDate +
                    ", автор - " + autor;
        }
    }

