class Book {
    String title;
    String author;
    boolean issued;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        issued = false;
    }

    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book already issued.");
        }
    }

    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was never issued.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "John");

        book.issueBook();
        book.issueBook();
        book.returnBook();
        book.returnBook();
    }
}

