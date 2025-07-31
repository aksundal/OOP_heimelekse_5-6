package OppgBook;// Oppgåve 6.1

import java.time.LocalDate;
import java.util.ArrayList;

//# Fields
public class Book {
    private String isbn;
    private LocalDate published;
    private String title;
    private String author;
    private int numberOfPages;
    private Genre genre;
    private ArrayList<Chapter> chapters;
    private int minutesPerPages;

    //# Getters and setters

    public int getMinutesPerPages() {
        return minutesPerPages;
    }

    public void setMinutesPerPages(int minutesPerPages) {
        this.minutesPerPages = minutesPerPages;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", published=" + published +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", genre=" + genre +
                ", chapters=" + chapters +
                ", minutesPerPages=" + minutesPerPages +
                '}';
    }
}
