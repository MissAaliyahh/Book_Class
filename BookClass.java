public class BookClass { 
    public static void main(String[] args) { 
       
        Book myBook = new Book("Introduction to Java", "Samuel L Jackson", 250);
        myBook.display();

        Book anotherBook = new Book(myBook);
        anotherBook.display();
    }
}