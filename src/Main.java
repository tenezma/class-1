public class Main {
    public static void main(String[] args) {
        Author authorOne=new Author ("Александр","Пушкин");
        System.out.println("Автор = " + authorOne.getName() + " " + authorOne.getSurname());
        Book bookOne=new Book("Капитанская дочь",1990,authorOne);
        System.out.println("Название произведения: "+ bookOne.getNameBook());
        System.out.println("Год публикации "+ bookOne.getPublishYear());
        System.out.println("Автор = " + bookOne.getAuthor().getName() + " " + bookOne.getAuthor().getSurname());
        bookOne.setPublishYear(2022);
        System.out.println("Год пуликации (новой) = " + bookOne.getPublishYear());
        Author authorTwo=new Author("Михаил","Булгаков");
        System.out.println("Автор = "+authorTwo.getName() +" "+ authorTwo.getSurname());
        Book bookTwo = new Book("Морфий",1991,authorTwo);
        System.out.println("Название произведения: "+ bookTwo.getNameBook());
        System.out.println("Год публикации "+ bookTwo.getPublishYear());
        System.out.println("Автор = " + bookTwo.getAuthor().getName() + " " + bookTwo.getAuthor().getSurname());
        bookTwo.setPublishYear(2010);
        System.out.println("Год пуликации (новой) = " +bookTwo.getPublishYear());
        System.out.println(bookOne);
        System.out.println(bookTwo);
    }
}