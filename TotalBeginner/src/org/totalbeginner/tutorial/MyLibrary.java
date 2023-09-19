package org.totalbeginner.tutorial;

import java.util.ArrayList;
import java.util.function.Supplier;

public class MyLibrary {

    String name;
    ArrayList < Book > books;
    ArrayList < Person > people;

    public MyLibrary(String name) {

        this.name = name;
        books = new ArrayList < Book > ();
        people = new ArrayList < Person > ();

    }

    public String getName() {
        return name;
    }

    public ArrayList < Book > getBooks() {
        return books;
    }

    public ArrayList < Person > getPeople() {
        return people;
    }

    public void addBook(Book b1) {
        this.books.add(b1);

    }

    public void removeBook(Book b1) {
        this.books.remove(b1);

    }

    public void addPerson(Person P1) {

        this.people.add(P1);
    }

    public void removePerson(Person P1) {

        this.people.remove(P1);
    }

    public boolean checkout(Book b1, Person p1) {

        if (b1.getPerson() == null) {

            b1.setPerson(p1);
            return true;
        }
        else return false;

    }

    public boolean checkIn(Book b1) {

        if (b1.getPerson() != null) {

            b1.setPerson(null);
            return true;
        } 
        else return false;
    }

}