import java.util.*;
class Book{
    String title;
    String author;
    boolean isIssued;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    void IssueBook() {
        if (isIssued == false) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void ReturnBook() {
        if (isIssued == true) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    // Method to display book details
    void displayBook() {
        System.out.println("\nBook ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

        if (isIssued == true) {
            System.out.println("Status: Issued");
        } else {
            System.out.println("Status: Available");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating book objects
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("C Programming", "Dennis Ritchie");
        Book book3 = new Book("Python Programming", "Guido van Rossum");

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    book1.displayBook();
                    book2.displayBook();
                    book3.displayBook();
                    break;

                case 2:
                    System.out.print("Enter title to issue: ");
                    int title = sc.nextString();

                    if (issueId == book1.title) {
                        book1.IssueBook();
			System.out.println("Book already issued")
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book title to return: ");
                    int title = sc.nextString();

       
