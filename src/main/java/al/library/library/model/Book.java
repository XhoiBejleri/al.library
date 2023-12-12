package al.library.library.model;

// Book Class
public class Book {
    private Long id;
    private String title;
    private Author author;
    private int yearPublished;

    // Constructor
    public Book(String title, Author author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Author class
    public static class Author {
        private String name;
        private String nationality;

        public Author() {

        }

    // Constructor
        public Author(String name, String nationality) {
            this.name = name;
            this.nationality = nationality;
        }
    // Getters and Setters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getNationality() {
            return nationality;
        }
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    }
}
