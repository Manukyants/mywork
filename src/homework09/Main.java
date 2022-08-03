package homework09;

public class Main {


    public static void main(String [] args){

        Book book = new Book("Палата №6", 1892);
        System.out.println("book.name = " + book.getName());
        System.out.println("book.year = " + book.getYear());
        book.setYear(1792);
        System.out.println("book.getYear() = " + book.getYear());

        Author author = new Author("Антон", "Чехов", "Павлович");
        System.out.println("author.surname = " + author.getSurname());
        System.out.println("author.name = " + author.getName());
        System.out.println("author.midle = " + author.getMidle());
    }
}
