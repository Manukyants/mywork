package homework09;

public class Main {


    public static void main(String [] args){

        Book book = new Book("������ �6", 1892);
        System.out.println("������������: " + book.getName() + ", ��� �������: " + book.getYear());

        Author author = new Author("�����", "�����", "��������");
        System.out.println("�����: " + author.getSurname() + " " + author.getName() + " " + author.getMidle());

        book.setYear(1792);
        System.out.println("������ ��������� ���� " + book.getYear() + " ��� �������");
    }
}
