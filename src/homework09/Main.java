package homework09;

public class Main {


    public static void main(String [] args){

        Book book = new Book("Палата №6", 1892);
        System.out.println("Произведение: " + book.getName() + ", год издания: " + book.getYear());

        Author author = new Author("Антон", "Чехов", "Павлович");
        System.out.println("Автор: " + author.getSurname() + " " + author.getName() + " " + author.getMidle());

        book.setYear(1790);
        System.out.println("Ручное изменение года " + book.getYear() + " год издания");
    }
}
