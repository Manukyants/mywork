package homework09;

public class Author {
    String name;
    String surname;
    String midle;
    public Author(String name, String surname, String midle) {
        this.name = name;
        this.surname = surname;
        this.midle = midle;

    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getMidle() {
        return this.midle;
    }
}
