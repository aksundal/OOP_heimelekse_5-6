package OppgBook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookRegister br = new BookRegister();
        Book b1 = new Book();
        b1.setTitle("Sulten");
        b1.setGenre(Genre.CLASSIC);
        b1.setAuthor("Knut Hamsun");
        b1.setNumberOfPages(111);
        b1.setChapters(new ArrayList<Chapter>());
        br.addBook(b1);


        Book b2 = new Book();
        b2.setTitle("Victoria");
        b2.setGenre(Genre.CLASSIC);
        b2.setAuthor("Knut Hamsun");
        b2.setNumberOfPages(75);
        Chapter chapter1 = new Chapter();
        chapter1.setTitle("Tittel");
        chapter1.setNumberOfPages(26);
        Chapter chapter2 = new Chapter();
        chapter2.setTitle("Tittel 2");
        chapter2.setNumberOfPages(50);

        ArrayList<Chapter> chapters = new ArrayList<>();
        chapters.add(chapter1);
        chapters.add(chapter2);
        b2.setChapters(chapters);
        br.addBook(b2);

        System.out.println("Number of books in register:"+ br.numberOfBooks());
        br.allBooksInRegister();
        br.booksByGenre(Genre.CLASSIC);
        System.out.println("Testing for FANTASY");
        br.booksByGenre(Genre.FANTASY);
        System.out.println("Books by Hamsun:");
        br.booksByAuthor("Knut Hamsun");
        System.out.println("Books by blablabla");
        br.booksByAuthor("Blabla bla");

        ArrayList<Book> books = br.booksByReadingTime(3);
        for (Book b :
        books){
            System.out.println(b);
        }
    }


}

/*
Skal legge til:
isbn (ny), published (ny, LocalDate),
title, author, numberOfPages, genre,
chapters (ArrayList) og minutesPerPage (ny).
 Det er litt knotete å ha lesetid på kapittel-nivå
 (slik vi hadde sist). Derfor har Book fått en
 minutesPerPage som angir lesetid for en side i boka.
 */
