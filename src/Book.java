public class Book {
    private  String nameBook;
    private int publishYear;
    private Author author;

    public Book(String nameBook, int year, Author author) {
        this.nameBook = nameBook;
        this.publishYear = year;
        this.author=author;
    }
    public Author getAuthor(){
        return this.author;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public int getPublishYear(){
        return this.publishYear;
    }
    public void setPublishYear(int publishYear){
       this.publishYear=publishYear;
    }

    @Override
    public String toString(){
        return "название книги "+nameBook+", год публикации "+ publishYear+ "автор "+ author;
}

    }

