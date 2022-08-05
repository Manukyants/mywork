package homework09;

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



}
