public class Book { 
    String title;
    String author; 
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages; 
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
        } 
    }