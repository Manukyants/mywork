package homework09;

public class Main {


    public static void main(String [] args){
        Author antonChehov = new Author("Антон", "Чехов", "Павлович");
        Book bookPalata6 = new Book("Палата №6", 1892, antonChehov);
        System.out.println("Произведение: " + bookPalata6.getName() + ", год издания: " + bookPalata6.getYear() + " " + "Автор: " + antonChehov);

        Author pushkin = new Author("Александр", "Пушкин", "Сергеевич");
        Book rusan = new Book("Руслан и людмила", 1820, pushkin);
        System.out.println("Произведение: " + rusan.getName() + ", год издания: " + rusan.getYear() + " " + "Автор: " + pushkin);

        bookPalata6.setYear(1790);
        System.out.println("Ручное изменение года: " + bookPalata6.getYear() + " год издания");
    }
}
