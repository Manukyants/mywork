package homework09;

import java.util.Objects;

public class Author {
    private String name;

    private String surname;
    private String midle;
    public Author(String name, String surname, String midle) {
        this.name = name;
        this.surname = surname;
        this.midle = midle;

    }
    public String toString(){
        return surname + " " + name + " " + midle;
    }




    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname) && Objects.equals(midle, author.midle);
    }


    public int hashCode() {
        return Objects.hash(name, surname, midle);
    }
}
