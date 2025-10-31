public class Book {
    private final String nameBook;
    private int publishYear;
    Author author;

    public Book(String nameBook, int year, String author) {
        this.nameBook = nameBook;
        this.publishYear = year;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
