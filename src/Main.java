public class Main {
    public static void main(String[] args) {
        Book onebook = new Book("Вий", 1990,"Гоголь");               // контруктор кл Book
        Author onebookAuthor = new Author ("Николай","Гоголь");              //конструктор кл Author
        System.out.println("onebook.nameBook = " + onebook.getNameBook());
        System.out.println("onebook.year = " + onebook.getPublishYear());
        System.out.println("onebookAuthor.name = " + onebookAuthor.getName()+" "+onebookAuthor.getSurname());
        Book secondBook = new Book("Нос", 1989,"Гоголь");               // контруктор кл Book
        Author secondAuthor = new Author("Николай","Гоголь");                   //конструктор кл Author
        System.out.println("secondBook.getNameBook() = " + secondBook.getNameBook());
        System.out.println("secondBook.getPublishYear() = " + secondBook.getPublishYear());
        System.out.println("secondAuthor.getName() = " + secondAuthor.getName()+" "+secondAuthor.getSurname());
        onebook.setPublishYear(2012);
        System.out.println("onebook.getPublishYear() = " + onebook.getPublishYear());


    }
}