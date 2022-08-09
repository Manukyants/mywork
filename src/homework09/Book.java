package homework09;

import java.util.Objects;

public class Book {


    private String nameBook;

    private int year;

    private Author author;
    public Book(String nameBook, int year, Author author) {
        this.nameBook = nameBook;
        this.year = year;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYear(){
        return this.year;
    }
    public Author getAuthor(){
        return author;
    }
    public void setYear(int year){
        this.year = year;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }
    public int hashCode() {
        return Objects.hash(nameBook, year, author);
    }
    public String toString() {
        return "Book{" +
                "name='" + nameBook + '\'' +
                '}';
    }
}
